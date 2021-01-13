package cn.edu.hcnu.bll.impl;

import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.bll.IFlightService;
import cn.edu.hcnu.dao.FlightDaoIml;
import cn.edu.hcnu.dao.IFlightDao;

import java.sql.SQLException;
import java.util.Set;

public class FlightServiceImpl implements IFlightService {

   IFlightDao iFlightDao;    //定义一个类

    //构造这个方法，调用这个FlightDaoTml()方法
   public FlightServiceImpl(){
       iFlightDao =new FlightDaoIml();
   }


    @Override
    public void insertFlight(Flight flight) throws SQLException {
       iFlightDao.insertFlight(flight);
        System.out.println(flight.getId()+"\n");
        System.out.println("界面传来的航班信息:"+flight+"\n");
    }

    @Override
    public Set<Flight> getAllFlights() throws SQLException {
       return iFlightDao.getAllFlights();
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
