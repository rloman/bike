package com.capgemini.bike.service;

import com.capgemini.bike.domain.Bike;
import com.capgemini.bike.repositories.BikeRepository;
import com.capgemini.bike.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BikeService {

    @Autowired
    private BikeRepository bikeRepository;

    @Autowired
    private PersonRepository personRepository;


    public Bike findById(long id) {

        return this.bikeRepository.findOne(id);
    }

    public Iterable<Bike> findAll() {
        return this.bikeRepository.findAll();
    }


}
