package com.assignment.passenger.flightbooking.controller;

import com.assignment.passenger.flightbooking.model.Booking;
import com.assignment.passenger.flightbooking.model.Passenger;
import com.assignment.passenger.flightbooking.service.BookingService;
import com.assignment.passenger.flightbooking.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class BookingUIController {

    @Autowired
    private BookingService bookingService;
    @Autowired
    private PassengerService passengerService;

    @GetMapping("/")
    public String getLandingPage(){
        return "index";
    }

    @GetMapping("/index")
    public String getLandingIndexPage(){
        return "index";
    }

    @GetMapping("/booking")
    public String getBookingPage(Model model){
        List<Passenger> passengerList = this.passengerService.getPassenger();
        model.addAttribute("passengerDetails", passengerList);
        return "bookflight";
    }

    @PostMapping("/bookingflight")
    public String saveBooking(@ModelAttribute("booking") Booking booking) {
        this.bookingService.saveBooking(booking);
        return "saved";
    }

    @GetMapping("/showbooking")
    public String getPassengerByPnr(@RequestParam("showbook") Long bookingId, Model model){
        if(bookingId <= 0) {
            List<Booking> booking = bookingService.getAllBookings();
            model.addAttribute("bookingDetails", booking);
        } else {
            Booking booking = bookingService.getBooking(bookingId);
            model.addAttribute("bookingDetails", booking);
        }
        return "showbooking";
    }




}
