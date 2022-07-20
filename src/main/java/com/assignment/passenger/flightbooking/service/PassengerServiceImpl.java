package com.assignment.passenger.flightbooking.service;

import com.assignment.passenger.flightbooking.entity.PassengerEntity;
import com.assignment.passenger.flightbooking.exception.BookingNotFoundException;
import com.assignment.passenger.flightbooking.model.Passenger;
import com.assignment.passenger.flightbooking.repository.PassengersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PassengerServiceImpl implements PassengerService{

    @Autowired
    private PassengersRepository passengersRepository;
    @Override
    public boolean savePassenger(Passenger passenger) {

        PassengerEntity passengerEntity = new PassengerEntity();
        passengerEntity.setPassengerId(passenger.getPassengerId());
        passengerEntity.setName(passenger.getName());
        passengerEntity.setAge(passenger.getAge());
        passengerEntity.setGender(passenger.getGender());
        passengerEntity.setSource(passenger.getSource());
        passengerEntity.setDestination(passenger.getDestination());


        passengersRepository.save(passengerEntity);

        return true;
    }

    @Override
    public List<Passenger> getPassenger() {
        Iterable<PassengerEntity> passengerList = this.passengersRepository.findAll();
        List<Passenger> passengersList = new ArrayList<>();
        for(PassengerEntity passList : passengerList) {
            Passenger passenger = new Passenger();
            passenger.setPassengerId(passList.getPassengerId());
            passenger.setName(passList.getName());
            passenger.setAge(passList.getAge());
            passenger.setGender(passList.getGender());
            passenger.setSource(passList.getSource());
            passenger.setDestination(passList.getDestination());

            passengersList.add(passenger);
        }
        return passengersList;
    }

    @Override
    public Passenger getPassengerById(Integer id) {
        Optional<PassengerEntity> passengerEntity = this.passengersRepository.findById(id);

        Passenger passenger = new Passenger();
        if(passengerEntity.isPresent()) {
            passenger.setPassengerId(passengerEntity.get().getPassengerId());
            passenger.setName(passengerEntity.get().getName());
            passenger.setAge(passengerEntity.get().getAge());
            passenger.setGender(passengerEntity.get().getGender());
            passenger.setSource(passengerEntity.get().getSource());
            passenger.setDestination(passengerEntity.get().getDestination());
        } else {
            throw new BookingNotFoundException("No Booking found for this "+id);
        }
        return passenger;
    }

    @Override
    public void deletePassenger(Integer id) {

        this.passengersRepository.deleteById(id);
    }
}
