package cn.edu.hcnu.bean;

public class Flight {
    private String id;

    private String flightId;   //飞机编号
    private String planeType;   //飞机类型
    private int currentSeatNumb;    //航班总座位数
    private String departureAirport;  //出发机场
    private String destinationAirport;     //目的机场
    private String departureTime;    //出发日期

    /*新建对象时候调用构造函数，可以初始化对象的属性，构造函数是创建java对象的重要途径，
      通过new关键字调用构造器时，构造器可以返回该类的对象*/
    public Flight(String id, String flightId, String planeType, int currentSeatNumb,
                  String departureAirport, String destinationAirport, String departureTime) {
        this.id = id;
        this.flightId = flightId;
        this.planeType = planeType;
        this.currentSeatNumb = currentSeatNumb;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.departureTime = departureTime;
    }

    public Flight(String flightId, String planeType, int currentSeatNumb,
                  String departureAirport, String destinationAirport, String departureTime) {
        this.flightId = flightId;
        this.planeType = planeType;
        this.currentSeatNumb = currentSeatNumb;
        this.departureAirport = departureAirport;
        this.destinationAirport = destinationAirport;
        this.departureTime = departureTime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public int getCurrentSeatNumb() {
        return currentSeatNumb;
    }

    public void setCurrentSeatNumb(int currentSeatNumb) {
        this.currentSeatNumb = currentSeatNumb;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public void setDestinationAirport(String destinationAirport) {
        this.destinationAirport = destinationAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    //方法调用
    //toString的作用是：
    // 输出一些当前对象的信息比如类标记等,基本上用到了都会重写,在使用pint(对象名)时就会
    // 自动调用toString方法,例如String类的toString方法就是打印字符串的内容。
    @Override
    public String toString() {
        return "Flight{" +
                "飞机编号='" + flightId + '\'' +
                ", 机型='" + planeType + '\'' +
                ", 总座位数=" + currentSeatNumb +
                ", 起飞机场='" + departureAirport + '\'' +
                ", 目的机场='" + destinationAirport + '\'' +
                ", 起飞时间='" + departureTime + '\'' +
                '}'+"\n";
    }
}