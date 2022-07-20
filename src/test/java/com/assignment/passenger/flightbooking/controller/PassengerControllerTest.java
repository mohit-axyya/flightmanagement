package com.assignment.passenger.flightbooking.controller;

import com.assignment.passenger.flightbooking.model.Passenger;
import com.assignment.passenger.flightbooking.service.PassengerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class PassengerControllerTest {

    @MockBean
    private PassengerService passengerService;
    @Test
    public void getPassenger() {
        Passenger passenger = new Passenger(1023, "Mohit", 28, "Male", "Udaipur", "Bangalore");



    }
}
