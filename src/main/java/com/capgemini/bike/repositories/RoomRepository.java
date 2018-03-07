package com.capgemini.bike.repositories;

import com.capgemini.bike.domain.Room;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface RoomRepository {

    Room findWhereBookingCheckoutDate(LocalDate date);
}
