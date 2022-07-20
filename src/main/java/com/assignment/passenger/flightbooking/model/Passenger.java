package com.assignment.passenger.flightbooking.model;



public class Passenger {

    private Integer passengerId;
    private String name;
    private Integer age;
    private String gender;
    private String source;
    private String destination;

    public Passenger() {
    }

    public Passenger(Integer passengerId, String name, Integer age, String gender, String source, String destination) {
        this.passengerId = passengerId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.source = source;
        this.destination = destination;
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

    @Override
    public String toString() {
        return "Passenger{" +
                "passengerId=" + passengerId +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                '}';
    }
}
