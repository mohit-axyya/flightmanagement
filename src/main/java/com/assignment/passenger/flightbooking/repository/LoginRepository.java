package com.assignment.passenger.flightbooking.repository;

import com.assignment.passenger.flightbooking.entity.LoginEntity;
import com.assignment.passenger.flightbooking.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<LoginEntity, String> {

    LoginEntity findByUsernameAndPassword(String username, String password);
}
