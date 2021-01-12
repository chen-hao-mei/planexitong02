package cn.hcnu.dao;

import cn.hcnu.bean.Flight;

import java.util.Set;

public interface IFlightDao {

    void insertFightDao(Flight flight);
    Set<Flight> getAllFlights();
    Flight getFlightByDepartureTime(String departureTime);
    Flight getFlightByDepartureAirport(String departureAirport);
    Flight getFlightByDestinationAirport(String destinationAirport);
    void updateFlight(Flight flight);

}
