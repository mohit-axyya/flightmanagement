package com.assignment.passenger.flightbooking.service;

import com.assignment.passenger.flightbooking.entity.BookingEntity;
import com.assignment.passenger.flightbooking.entity.PassengerEntity;
import com.assignment.passenger.flightbooking.model.Booking;
import com.assignment.passenger.flightbooking.repository.BookingRepository;
import com.assignment.passenger.flightbooking.repository.PassengersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class BookingServiceImpl implements BookingService{

    @Autowired
    private BookingRepository bookingRepository;
    @Autowired
    private PassengersRepository passengersRepository;

    public List<Booking> getAllBookings() {
        Iterable<BookingEntity> bookingEntity = this.bookingRepository.findAll();
        List<Booking> bookingList = new ArrayList<>();
        for(BookingEntity booking : bookingEntity) {
            Booking book = new Booking();
            book.setBookingId(booking.getBookingId());
            book.setBookingDate(booking.getBookingDate());
            book.setNoOfPassengers(booking.getNoOfPassengers());

            bookingList.add(book);
        }
        return bookingList;
    }

    public String saveBooking(Booking booking) {

        PassengerEntity passengerEntities = new PassengerEntity();

        BookingEntity bookingEntity = new BookingEntity();
        bookingEntity.setBookingId(booking.getBookingId());
        System.out.println("passenger id"+booking.getPassengers());
        Optional<PassengerEntity> passengerEntityOfList =
                    this.passengersRepository.findById(booking.getPassengers());
        bookingEntity.setBookingDate(booking.getBookingDate());
        bookingEntity.setNoOfPassengers(booking.getNoOfPassengers());


        passengerEntities.setPassengerId(passengerEntityOfList.get().getPassengerId());
        passengerEntities.setName(passengerEntityOfList.get().getName());
        passengerEntities.setAge(passengerEntityOfList.get().getAge());
        passengerEntities.setGender(passengerEntityOfList.get().getGender());
        passengerEntities.setSource(passengerEntityOfList.get().getSource());
        passengerEntities.setDestination(passengerEntityOfList.get().getDestination());


        bookingEntity.setPassengerEntity(passengerEntities);

        bookingRepository.save(bookingEntity);
        return "Saved";
    }

    @Override
    public Booking getBooking(Long id) {
        Optional<BookingEntity> bookingEntity =  this.bookingRepository.findById(id);
        Booking booking = new Booking();
        booking.setBookingId(bookingEntity.get().getBookingId());
        booking.setBookingDate(bookingEntity.get().getBookingDate());
        booking.setNoOfPassengers(bookingEntity.get().getNoOfPassengers());
        return booking;
    }


}
