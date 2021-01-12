package cn.hcnu.bll;

import cn.hcnu.bean.Flight;

import java.util.Set;

public interface IFlightService {
    void insertFightDao(Flight flight);
    Set<Flight> getAllFlights();
    Flight getFlightByDepartureTime(String departureTime);
    Flight getFlightByDepartureAirport(String departureAirport);
    Flight getFlightByDestinationAirport(String destinationAirport);
    void updateFlight(Flight flight);

    void insertFlight(Flight flight);
}

