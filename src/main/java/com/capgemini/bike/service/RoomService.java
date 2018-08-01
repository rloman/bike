package com.capgemini.bike.service;

import com.capgemini.bike.domain.Booking;
import com.capgemini.bike.domain.Room;
import com.capgemini.bike.repositories.BookingRepository;
import com.capgemini.bike.repositories.RoomRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;

@Service
@EnableScheduling
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private BookingRepository bookingRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(RoomService.class);

    @PostConstruct
    public void init() {
        {
            Room r=  new Room();
            r.setRoomNumber(Integer.valueOf(13).shortValue());

            Booking b = new Booking(LocalDate.now().minusDays(30), LocalDate.now().minusDays(1));

            r.addBooking(b);


            this.roomRepository.save(r);

            LOGGER.error("Saved room [{}]", r);
            LOGGER.error("Saved booking [{}]", b);
        }

        {
            Room r=  new Room();
            r.setRoomNumber(Integer.valueOf(201).shortValue());

            Booking b = new Booking(LocalDate.now(), LocalDate.now().plusDays(15));


            r.addBooking(b);


            this.roomRepository.save(r);

            LOGGER.error("Saved room [{}]", r);
            LOGGER.error("Saved booking [{}]", b);
        }


    }

    @Scheduled(cron= "*/10 * * * * *")
    public void getForMuriel() {
        {
            Room r = this.roomRepository.findByBookingsCheckoutDateLessThanAndBookingsCheckinDateGreaterThan(LocalDate
                            .now(),

                    LocalDate
                            .now().minusDays(50));

            LOGGER.error("Got room [{}]", r);
        }

        {
            Room r = this.roomRepository.findByBookingsCheckoutDateLessThanAndBookingsCheckinDateGreaterThan(LocalDate.now().plusMonths(1),

                    LocalDate
                            .now().minusDays(1));

            LOGGER.error("Got room [{}]", r);
        }

    }
}
