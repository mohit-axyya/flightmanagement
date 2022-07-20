package com.assignment.passenger.flightbooking.service;

import com.assignment.passenger.flightbooking.entity.FlightEntity;
import com.assignment.passenger.flightbooking.model.Flight;
import com.assignment.passenger.flightbooking.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FlightServiceImpl implements FlightService{

    @Autowired
    private FlightRepository flightRepository;

    public List<Flight> getAllFlights() {

        Iterable<FlightEntity> flightEntity = this.flightRepository.findAll();
        List<Flight> listOfFlights = new ArrayList<>();
        for(FlightEntity flight : flightEntity) {
            Flight flights = new Flight();
            flights.setFlightNo(flight.getFlightNo());
            flights.setFlightModel(flight.getFlightModel());
            flights.setCarrierName(flight.getCarrierName());
            flights.setSeatCapacity(flight.getSeatCapacity());


            listOfFlights.add(flights);
        }
        return listOfFlights;
    }
}
