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

    public Booking() {

    }

    public Booking(LocalDate checkinDate, LocalDate checkoutDate) {
        this.checkinDate = checkinDate;
        this.checkoutDate = checkoutDate;
    }

    public long getId() {
        return id;
    }

    public void setCheckinDate(LocalDate checkinDate) {
        this.checkinDate = checkinDate;
    }

    public void setCheckoutDate(LocalDate checkoutDate) {
        this.checkoutDate = checkoutDate;
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

    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", checkinDate=" + checkinDate +
                '}';
    }

    public void addRoom(Room r) {
        this.rooms.add(r);
        r.getBookings().add(this);
    }
}
