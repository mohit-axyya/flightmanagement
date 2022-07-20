package com.assignment.passenger.flightbooking.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "booking")
public class BookingEntity {

    @Id
    @Column(name = "booking_id")
    private Long bookingId;
    private String bookingDate;
    private int noOfPassengers;

    @ManyToOne
    @JoinColumn(name = "passenger_entity_id")
    private PassengerEntity passengerEntity;

    @ManyToOne
    @JoinColumn(name = "flight_no")
    private FlightEntity flightEntity;
    public BookingEntity() {
    }

    public BookingEntity(Long bookingId, String bookingDate, int noOfPassengers, PassengerEntity passengerEntity) {
        this.bookingId = bookingId;
        this.bookingDate = bookingDate;
        this.noOfPassengers = noOfPassengers;
        this.passengerEntity = passengerEntity;
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

    public PassengerEntity getPassengerEntity() {
        return passengerEntity;
    }

    public void setPassengerEntity(PassengerEntity passengerEntity) {
        this.passengerEntity = passengerEntity;
    }

    @Override
    public String toString() {
        return "BookingEntity{" +
                "bookingId=" + bookingId +
                ", bookingDate='" + bookingDate + '\'' +
                ", noOfPassengers=" + noOfPassengers +
                ", passengerEntity=" + passengerEntity +
                '}';
    }
}
