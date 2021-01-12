package cn.hcnu.bll.impl;

import cn.hcnu.bean.Flight;
import cn.hcnu.bll.IFlightService;
import cn.hcnu.dao.FlightDaoIml;
import cn.hcnu.dao.IFlightDao;

import java.util.Set;

public class FlightServiceImpl implements IFlightService {

   IFlightDao iFlightDao;

   public FlightServiceImpl(){
       iFlightDao =new FlightDaoIml();
   }


    @Override
    public void insertFightDao(Flight flight) {

    }

    @Override
    public Set<Flight> getAllFlights() {
        return null;
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

    @Override
    public void insertFlight(Flight flight) {

    }
}
