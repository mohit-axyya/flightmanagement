package com.assignment.passenger.flightbooking.model;

public class Login {
    private Integer username;
    private String password;

    public Login() {
    }

    public Login(Integer username, String password) {
        this.username = username;
        this.password = password;
    }

    public Integer getUsername() {
        return username;
    }

    public void setUsername(Integer username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Login{" +
                "username=" + username +
                ", password='" + password + '\'' +
                '}';
    }
}
