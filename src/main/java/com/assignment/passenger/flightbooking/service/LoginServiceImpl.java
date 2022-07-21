package com.assignment.passenger.flightbooking.service;

import com.assignment.passenger.flightbooking.entity.LoginEntity;
import com.assignment.passenger.flightbooking.model.Login;
import com.assignment.passenger.flightbooking.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;

public class LoginServiceImpl {

    @Autowired
    private LoginRepository loginRepository;

    @GetMapping("/login")
    public String userIsValid(Login login) {
        LoginEntity loginEntity = this.loginRepository.findByUsernameAndPassword(login.getUsername(), login.getPassword());
        if(loginEntity != null) {
            return "addpassenger";
        }
        return "error404";
    }
}
