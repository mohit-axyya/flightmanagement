package com.assignment.passenger.flightbooking.model;

public class Booking {
    private Long bookingId;
    private String bookingDate;
    private int noOfPassengers;

    private int passengers;

    public Booking() {
    }

    public Booking(Long bookingId, String bookingDate, int noOfPassengers, int passengers) {
        this.bookingId = bookingId;
        this.bookingDate = bookingDate;
        this.noOfPassengers = noOfPassengers;
        this.passengers = passengers;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    public void setNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", bookingDate='" + bookingDate + '\'' +
                ", noOfPassengers=" + noOfPassengers +
                ", passengers=" + passengers +
                '}';
    }
}
