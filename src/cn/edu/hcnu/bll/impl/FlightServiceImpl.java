package cn.edu.hcnu.bll.impl;

import cn.edu.hcnu.bean.Flight;
import cn.edu.hcnu.bll.IFlightService;
import cn.edu.hcnu.dao.FlightDaoIml;
import cn.edu.hcnu.dao.IFlightDao;

import java.sql.SQLException;
import java.util.Set;

public class FlightServiceImpl implements IFlightService {

   IFlightDao iFlightDao;    //定义一个类

    //构造这个方法，并且调用FlightDaoTml()方法
   public FlightServiceImpl(){
       iFlightDao =new FlightDaoIml();
   }

   //返回界面录入的信息
    @Override
    public void insertFlight(Flight flight) throws SQLException {
       iFlightDao.insertFlight(flight);
        System.out.println("此航班的ID为"+flight.getId()+"\n");
        System.out.println("界面传来的航班信息:"+"\n"+flight);
    }

    //将录入的信息显示出来
    @Override
    public Set<Flight> getAllFlights() throws SQLException {
       return iFlightDao.getAllFlights();
    }

    //按相应查询方式查询航班信息
    @Override
    public Flight getFlightByDepartureTime(String departureTime) throws SQLException {
        return iFlightDao.getFlightByDepartureTime(departureTime);
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
