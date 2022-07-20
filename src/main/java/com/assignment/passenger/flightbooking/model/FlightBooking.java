package com.assignment.passenger.flightbooking.model;

public class FlightBooking {
    private Long bookingId;
    private String bookingDate;
    private int noOfPassengers;
    private String passangerName;
    private String carrierName;

    public FlightBooking() {
    }

    public FlightBooking(Long bookingId, String bookingDate, int noOfPassengers, String passangerName, String carrierName) {
        this.bookingId = bookingId;
        this.bookingDate = bookingDate;
        this.noOfPassengers = noOfPassengers;
        this.passangerName = passangerName;
        this.carrierName = carrierName;
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

    public String getPassangerName() {
        return passangerName;
    }

    public void setPassangerName(String passangerName) {
        this.passangerName = passangerName;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    @Override
    public String toString() {
        return "FlightBooking{" +
                "bookingId=" + bookingId +
                ", bookingDate='" + bookingDate + '\'' +
                ", noOfPassengers=" + noOfPassengers +
                ", passangerName='" + passangerName + '\'' +
                ", carrierName='" + carrierName + '\'' +
                '}';
    }
}
