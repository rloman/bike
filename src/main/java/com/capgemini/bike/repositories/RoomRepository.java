package com.capgemini.bike.repositories;

import com.capgemini.bike.domain.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {

    Room findByBookingsCheckoutDate(LocalDate date);
    Room findByBookingsCheckoutDateLessThanAndBookingsCheckinDateGreaterThan(LocalDate checkout, LocalDate checkin);
}
