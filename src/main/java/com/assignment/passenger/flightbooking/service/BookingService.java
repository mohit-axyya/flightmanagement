package com.assignment.passenger.flightbooking.service;

import com.assignment.passenger.flightbooking.entity.BookingEntity;
import com.assignment.passenger.flightbooking.model.Booking;

import java.util.List;

public interface BookingService {

    public List<Booking> getAllBookings();
    public String saveBooking(Booking booking);

    public Booking getBooking(Long id);

}
