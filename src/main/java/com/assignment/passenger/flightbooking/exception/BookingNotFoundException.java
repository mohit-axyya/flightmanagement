package com.assignment.passenger.flightbooking.exception;

import java.io.Serial;

public class BookingNotFoundException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 1L;
    public BookingNotFoundException(String msg) {
        super(msg);
    }
}
