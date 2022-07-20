package com.assignment.passenger.flightbooking.repository;

import com.assignment.passenger.flightbooking.entity.PassengerEntity;
import com.assignment.passenger.flightbooking.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PassengersRepository extends CrudRepository<PassengerEntity, Integer> {

}
