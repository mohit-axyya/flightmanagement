package com.assignment.passenger.flightbooking.repository;

import com.assignment.passenger.flightbooking.entity.BookingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BookingRepository extends CrudRepository<BookingEntity, Long> {
}
