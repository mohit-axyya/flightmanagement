package com.assignment.passenger.flightbooking.service;

import com.assignment.passenger.flightbooking.entity.PassengerEntity;
import com.assignment.passenger.flightbooking.model.Passenger;

import java.util.List;

public interface PassengerService {

    boolean savePassenger(Passenger passenger);
    List<Passenger> getPassenger();

    Passenger getPassengerById(Integer id);
    void deletePassenger(Integer id);
}
