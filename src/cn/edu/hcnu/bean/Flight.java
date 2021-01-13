package cn.edu.hcnu.bean;

public class Flight {
    private String id;

    private String flightId;   //飞机编号
    private String planeType;   //飞机类型
    private int currentSeatNumb;    //航班总座位数
    private String departureAirport;  //出发机场
    private String destinationAirport;     //目的机场
    private String departureTime;    //出发日期

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