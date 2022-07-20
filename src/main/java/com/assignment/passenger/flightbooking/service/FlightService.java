package com.assignment.passenger.flightbooking.service;

import com.assignment.passenger.flightbooking.entity.FlightEntity;
import com.assignment.passenger.flightbooking.model.Flight;

import java.util.List;

public interface FlightService {
    public List<Flight> getAllFlights();
}
