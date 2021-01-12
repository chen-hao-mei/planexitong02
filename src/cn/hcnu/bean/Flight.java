package cn.hcnu.bean;

public class Flight {
    private String id;
    private String planeType;   //飞机类型
    private String seatsNo;   //座位号
    private String totalseatNumb;    //航班总座位数
    private String departureAirpot;  //出发机场
    private String destinationAirport;     //目的机场
    private String departureTime;    //出发日期

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getSeatsNo() {
        return seatsNo;
    }

    public void setSeatsNo(String seatsNo) {
        this.seatsNo = seatsNo;
    }

    public String getTotalseatNumb() {
        return totalseatNumb;
    }

    public void setTotalseatNumb(String totalseatNumb) {
        this.totalseatNumb = totalseatNumb;
    }

    public String getDepartureAirpot() {
        return departureAirpot;
    }

    public void setDepartureAirpot(String departureAirpot) {
        this.departureAirpot = departureAirpot;
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
}