package com.assignment.passenger.flightbooking.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "passenger")
public class PassengerEntity {

    @Id
    @Column(name = "passenger_id")
    private Integer passengerId;
    private String name;
    private Integer age;
    private String gender;
    private String source;
    private String destination;

    @OneToMany(mappedBy = "passengerEntity")
    private List<BookingEntity> bookingEntity;

    public PassengerEntity() {
    }

    public PassengerEntity(Integer passengerId, String name, Integer age, String gender, String source, String destination, List<BookingEntity> bookingEntity) {
        this.passengerId = passengerId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.source = source;
        this.destination = destination;
        this.bookingEntity = bookingEntity;
    }

    public Integer getPassengerId() {
        return passengerId;
    }

    public void setPassengerId(Integer passengerId) {
        this.passengerId = passengerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public List<BookingEntity> getBookingEntity() {
        return bookingEntity;
    }

    public void setBookingEntity(List<BookingEntity> bookingEntity) {
        this.bookingEntity = bookingEntity;
    }

    @Override
    public String toString() {
        return "PassengerEntity{" +
                "passengerId=" + passengerId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", bookingEntity=" + bookingEntity +
                '}';
    }
}
