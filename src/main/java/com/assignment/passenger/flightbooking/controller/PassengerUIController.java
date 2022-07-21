package com.assignment.passenger.flightbooking.controller;

import com.assignment.passenger.flightbooking.model.Passenger;
import com.assignment.passenger.flightbooking.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class PassengerUIController {


    @Autowired
    private PassengerService passengerService;

    @GetMapping("/booking/{passengerId}")
    public String getPassengerByPnrRest(@PathVariable Integer passengerId, Model model){

        Passenger passenger = passengerService.getPassengerById(passengerId);
        model.addAttribute("passenger", passenger);
        return "passengerdetails";
    }

    @GetMapping("/bookingnumber")
    public String getPassengerByPnr(@RequestParam("searchbar") Integer passengerId, Model model){
        if(passengerId <= 0) {
            List<Passenger> passenger = passengerService.getPassenger();
            model.addAttribute("passenger", passenger);
        } else {
            Passenger passenger = passengerService.getPassengerById(passengerId);
            model.addAttribute("passenger", passenger);
        }
        return "passengerdetails";
    }

    @PostMapping("/addpassenger")
    public String savePassenger(@ModelAttribute Passenger passenger) {

        this.passengerService.savePassenger(passenger);
        return "addpassenger";
    }
}
