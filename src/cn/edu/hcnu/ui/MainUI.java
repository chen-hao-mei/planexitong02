package cn.edu.hcnu.ui;

import cn.edu.hcnu.bll.IFlightService;
import cn.edu.hcnu.bll.impl.FlightServiceImpl;
import cn.edu.hcnu.bean.Flight;

import java.sql.SQLException;
import java.util.Scanner;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainUI {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);   //接受键盘输入

        while (true) {
            System.out.println("请输入相应数字进行操作：");

            System.out.println("按1，录入航班信息");
            System.out.println("按2，显示所有航班信息");
            System.out.println("按3，查询航班信息");
            System.out.println("按4，机票预订");
            System.out.println("按5，机票退订");
            System.out.println("按6，退出系统");

            int choice = sc.nextInt();

            if (choice == 1) {
                //使用replace方法使原来数据ID中的“-”消去，从而不会使原来数值过大而出错
                //原来定义的数据ID为varchar类型32位，没有replace方法会输出36位字符
                String id = UUID.randomUUID().toString().replace("-", "");

                System.out.print("请输入请飞机编号:");
                String flightId = sc.next();
                System.out.print("请输入请输入机型:");
                String planeType = sc.next();
                System.out.print("请输入座位数:");
                int currentSeatNumb = sc.nextInt();
                System.out.print("请输入起飞机场:");
                String departureAirport = sc.next();
                System.out.print("请输入目的机场:");
                String destinationAirport = sc.next();
                System.out.print("请输入起飞时间:");
                String departureTime = sc.next();

                Flight flight = new Flight(id, flightId, planeType, currentSeatNumb,
                        departureAirport, destinationAirport, departureTime);

                //方法一：利用try...catch方法找出错误异常
                IFlightService iFlightService = new FlightServiceImpl(); //用接口实现对象
                try {
                    iFlightService.insertFlight(flight);
                } catch (SQLException e) {
                    String errorMessage = e.getMessage();
                    String errorId = errorMessage.substring(0, 9);
                    System.out.println("错误编号：" + errorId);
                    if ("OPA-12899".equals(errorId)) {
                        System.out.println("某列的值过大，请仔细检查！");
                    }
                }

                //方法二：用正则表示法实现查找错误异常
                /*IFlightService iFlightService = new FlightServiceImpl();
                try {
                    iFlightService.insertFlight(flight);
                } catch (SQLException e) {
                    String errorMessage = e.getMessage();
                    if (errorMessage.startsWith("ORA-12899")) {
                        //ORA-12899: value too large for column "OPTS"."FLIGHT"."ID" (actual: 32, maximum: 30)
                        // 按指定模式在字符串查找
                        String pattern = "(\\w+-\\d{5}):(\\s\\w+)+\\s(\"\\w+\")\\.(\"\\w+\")\\.(\"\\w+\")";
                        // 创建 Pattern 对象
                        Pattern r = Pattern.compile(pattern);
                        // 现在创建 matcher 对象
                        Matcher m = r.matcher(errorMessage);
                        if (m.find()) {
                            String tableName = m.group(4);
                            String columnName = m.group(5);
                            System.out.println(tableName + "表的" + columnName + "这一列的值过大，请仔细检查");
                        } else {
                            System.out.println("NO MATCH");
                        }
                    }
                }*/
            }else if (choice==2){
                IFlightService iFlightService=new FlightServiceImpl();
                try{
                    Set<Flight> allFlight=iFlightService.getAllFlights();

                    //Set的遍历需要用到迭代器
                    for (Flight flight:allFlight){
                        System.out.println(flight);
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }else if (choice ==3 ){

                System.out.println("请输入相应数字查询相应信息");
                System.out.println("1，按起飞时间查询:");
                System.out.println("2，按空座位号查询:");
                System.out.println("3，按起飞机场查询:");
                System.out.println("4，按目的机场查询:");

                int chooce=sc.nextInt();
                if (chooce == 1){
                    System.out.print("请输入起飞时时间:");
                    String departureTime=sc.next();
                    IFlightService iFlightService = new FlightServiceImpl(); //用接口实现对象
                    try {
                        Flight flight=iFlightService.getFlightByDepartureTime(departureTime);
                        if (flight!=null){
                            System.out.println("查询结果如下:" + "\n"+flight);
                        }else {
                            System.out.println("没有查询到该时间的航班信息");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
