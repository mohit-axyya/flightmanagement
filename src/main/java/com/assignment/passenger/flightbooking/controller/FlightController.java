package com.assignment.passenger.flightbooking.controller;

import com.assignment.passenger.flightbooking.entity.FlightEntity;
import com.assignment.passenger.flightbooking.model.Flight;
import com.assignment.passenger.flightbooking.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;
    @GetMapping("/")
    public List<Flight> getAllFlights() {
        return this.flightService.getAllFlights();
    }
}
