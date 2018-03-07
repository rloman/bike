package com.capgemini.bike.domain;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private LocalDate checkinDate;

    private LocalDate checkoutDate;

    @ManyToMany
    private Set<Room> rooms = new HashSet<>();

    public long getId() {
        return id;
    }

    public LocalDate getCheckinDate() {
        return checkinDate;
    }

    public LocalDate getCheckoutDate() {
        return checkoutDate;
    }

    public Set<Room> getRooms() {
        return rooms;
    }

    public void addRoom(Room r) {
        this.rooms.add(r);
        r.getBookings().add(this);
    }
}
