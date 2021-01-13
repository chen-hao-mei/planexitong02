package cn.edu.hcnu.dao;

import cn.edu.hcnu.bean.Flight;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class FlightDaoIml implements IFlightDao {


    @Override
        public void insertFlight(Flight flight) throws SQLException {
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
            String username="opts";
            String password="opts1234";
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

    @Override
    public Set<Flight> getAllFlights() throws SQLException {

        Set<Flight> allFlights=new HashSet<Flight>();

        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String username="opts";
        String password="opts1234";
        Connection conn= DriverManager.getConnection(url,username,password);
        String sql="SELECT * FROM flight";
        PreparedStatement pstmt=conn.prepareStatement(sql);
        ResultSet rs=pstmt.executeQuery();
        while(rs.next()){

            String id=rs.getString("ID");
            String flightId=rs.getString("FLIGHT_ID");
            String planeType=rs.getString("PLANE_TYPE");
            int currentSeatNumb =rs.getInt("TOTAL_SEATS_NUM");
            String departureAirport=rs.getString("DEPARTURE_AIRPORT");
            String destinationAirport=rs.getString("DESTINATION_AIRPORT");
            String departureTime=rs.getString("DEPARTURE_TIME");

            Flight flight = new Flight(id, flightId, planeType, currentSeatNumb,
                    departureAirport, destinationAirport, departureTime);
            allFlights.add(flight);
        }
        return allFlights;
    }

    @Override
    public Flight getFlightByDepartureTime(String departureTime) {
        return null;
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
