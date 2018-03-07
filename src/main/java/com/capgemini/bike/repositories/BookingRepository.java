package com.capgemini.bike.repositories;

import com.capgemini.bike.domain.Booking;
import org.springframework.data.repository.CrudRepository;

public interface BookingRepository extends CrudRepository <Booking, Long>{
}
