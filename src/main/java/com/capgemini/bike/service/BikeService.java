package com.capgemini.bike.service;

import com.capgemini.bike.domain.Bike;
import com.capgemini.bike.repositories.BikeRepository;
import com.capgemini.bike.repositories.PersonRepository;
import com.capgemini.bike.util.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class BikeService {

    @Autowired
    private BikeRepository bikeRepository;

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private Calculator calculator;




    public Bike findById(long id) {

        return this.bikeRepository.findOne(id);
    }

    public Iterable<Bike> findAll() {
        return this.bikeRepository.findAll();
    }


    @Transactional
    public int foo() {
        return this.calculator.add(3,4);
    }


}
