package com.assignment.passenger.flightbooking.controller;

import com.assignment.passenger.flightbooking.entity.BookingEntity;
import com.assignment.passenger.flightbooking.model.Booking;
import com.assignment.passenger.flightbooking.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping("/")
    public List<Booking> getAllBookings() {

        return this.bookingService.getAllBookings();
    }
}
