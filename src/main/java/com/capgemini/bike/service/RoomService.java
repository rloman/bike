package com.capgemini.bike.service;

import com.capgemini.bike.domain.Room;
import com.capgemini.bike.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    @PostConstruct
    public void init() {
        Room r=  new Room();
        r.setRoomNumber(Integer.valueOf(13).shortValue());

        this.roomRepository.save(r);

    }
}
