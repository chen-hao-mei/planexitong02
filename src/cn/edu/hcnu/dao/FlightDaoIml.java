package cn.edu.hcnu.dao;

import cn.edu.hcnu.bean.Flight;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class FlightDaoIml implements IFlightDao {

    //录入航班信息
    //在Java中使用？表示数据
    @Override
        public void insertFlight(Flight flight) throws SQLException {
        String url="jdbc:oracle:thin:@localhost:1521:orcl";    //连接到数据库
            String username="opts";     //所连接到的数据库用户名
            String password="opts1234";   //密码

        //打印输出conn检查conn是否为空，为空时对其做出判断，new一个connection
            Connection conn= DriverManager.getConnection(url,username,password);
            String sql="INSERT INTO flight VALUES(?,?,?,?,?,?,?)";
            PreparedStatement pstmt=conn.prepareStatement(sql);
            pstmt.setString(1,flight.getId());
            pstmt.setString(2,flight.getFlightId());
            pstmt.setString(3,flight.getPlaneType());
            pstmt.setInt(4,flight.getCurrentSeatNumb());
            pstmt.setString(5,flight.getDepartureAirport());
            pstmt.setString(6,flight.getDestinationAirport());
            pstmt.setString(7,flight.getDepartureTime());

            pstmt.executeUpdate();
        }

        //显示航班信息。
        // java中尽量不要使用*代表数据库中要查询的数据，这样会使得运行速度比较慢，
        // 查询哪些数据就列出来，可以在*的基础上提高查询速度。
    @Override
    public Set<Flight> getAllFlights() throws SQLException {

        Set<Flight> allFlights=new HashSet<Flight>();

        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String username="opts";
        String password="opts1234";

        Connection conn= DriverManager.getConnection(url,username,password);
        String sql="SELECT FLIGHT_ID,PLANE_TYPE,TOTAL_SEATS_NUM,DEPARTURE_AIRPORT," +
                "DESTINATION_AIRPORT,DEPARTURE_TIME FROM flight";
        PreparedStatement pstmt=conn.prepareStatement(sql);
        ResultSet rs=pstmt.executeQuery();
        while(rs.next()){

            String flightId=rs.getString("FLIGHT_ID");
            String planeType=rs.getString("PLANE_TYPE");
            int currentSeatNumb =rs.getInt("TOTAL_SEATS_NUM");
            String departureAirport=rs.getString("DEPARTURE_AIRPORT");
            String destinationAirport=rs.getString("DESTINATION_AIRPORT");
            String departureTime=rs.getString("DEPARTURE_TIME");

            //构造方法
            Flight flight = new Flight(flightId, planeType, currentSeatNumb,
                    departureAirport, destinationAirport, departureTime);
            allFlights.add(flight);
        }
        return allFlights;
    }

    //查询数据
    @Override
    public Flight getFlightByDepartureTime(String departureTime) throws SQLException {
        String sql="SELECT FLIGHT_ID,PLANE_TYPE,TOTAL_SEATS_NUM,DEPARTURE_AIRPORT," +
                "DESTINATION_AIRPORT,DEPARTURE_TIME FROM flight WHERE DEPARTURE_TIME=?";
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String username="opts";
        String password="opts1234";
        Connection conn= DriverManager.getConnection(url,username,password);
        Flight flight=null;
        PreparedStatement pstmt=conn.prepareStatement(sql);
        pstmt.setString(1,departureTime);   //使用 String 型设置指定列的值
        ResultSet rs=pstmt.executeQuery();
        while(rs.next()) {

            String flightId = rs.getString("FLIGHT_ID");
            String planeType = rs.getString("PLANE_TYPE");
            int currentSeatNumb = rs.getInt("TOTAL_SEATS_NUM");
            String departureAirport = rs.getString("DEPARTURE_AIRPORT");
            String destinationAirport = rs.getString("DESTINATION_AIRPORT");
            String departureTimes = rs.getString("DEPARTURE_TIME");

            flight = new Flight(flightId, planeType, currentSeatNumb,
                    departureAirport, destinationAirport, departureTimes);
        }

        return flight;
    }

    @Override
    public Flight getFlightByDepartureAirport(String departureAirport) {
        return null;
    }

    @Override
    public Flight getFlightByDestinationAirport(String destinationAirport) {
        return null;
    }

    @Override
    public void updateFlight(Flight flight) {

    }
}
