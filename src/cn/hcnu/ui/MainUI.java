package cn.hcnu.ui;

import cn.hcnu.bean.Flight;
import cn.hcnu.bll.IFlightService;
import cn.hcnu.bll.impl.FlightServiceImpl;

import java.util.Scanner;
import java.util.UUID;

public class MainUI {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);   //接受键盘输入

        while(true){
            System.out.println("请输入相应数字进行操作：");

            System.out.println("按1，录入航班信息");
            System.out.println("按2，显示所有航班信息");
            System.out.println("按3，查询航班信息");
            System.out.println("按4，机票预订");
            System.out.println("按5，机票退订");
            System.out.println("按6，退出系统");

            int choice=sc.nextInt();

            if (choice ==1){
                String  id =UUID.randomUUID().toString();

                System.out.print("请输入请飞机编号");
                String flightId=sc.next();
                System.out.println("请输入请输入机型");
                String planeType=sc.next();
                System.out.println("请输入座位数");
                int currentSeatNumb=sc.nextInt();
                System.out.println("请输入起飞机场");
                String departureAirport=sc.next();
                System.out.println("请输入目的机场");
                String destinationAirport=sc.next();
                System.out.println("请输入起飞时间");
                String departureTime=sc.next();

                Flight flight=new Flight(id,flightId,planeType,currentSeatNumb,
                        departureAirport,destinationAirport,departureTime);

                IFlightService iFlightService =new FlightServiceImpl(); //用接口实现对象
                iFlightService.insertFlight(flight);
                }
            }
        }
}
