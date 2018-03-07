package com.capgemini.bike.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Room {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private short roomNumber;

    @ManyToMany(mappedBy = "rooms")
    private Set<Booking> bookings = new HashSet<>();

    public long getId() {
        return id;
    }

    public short getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(short roomNumber) {
        this.roomNumber = roomNumber;
    }


    public Set<Booking> getBookings() {
        return bookings;
    }

    public void addBooking(Booking b) {
        this.bookings.add(b);
        b.getRooms().add(this);
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomNumber=" + roomNumber +
                '}';
    }
}
