package com.assignment.passenger.flightbooking.repository;

import com.assignment.passenger.flightbooking.entity.FlightEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<FlightEntity, Long> {

}
