package com.assignment.passenger.flightbooking.controller;

import com.assignment.passenger.flightbooking.model.Flight;
import com.assignment.passenger.flightbooking.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FlightUIController {

    @Autowired
    private FlightService flightService;

    @GetMapping("/showflights")
    public String getAllFlights(Model model) {

        List<Flight> listOfFlights = this.flightService.getAllFlights();
        System.out.println(listOfFlights);
        model.addAttribute("listOfFlights", listOfFlights);
        return "showflights";
    }
}
