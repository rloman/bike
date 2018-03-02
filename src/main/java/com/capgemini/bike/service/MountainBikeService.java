package com.capgemini.bike.service;

import com.capgemini.bike.domain.MountainBike;
import com.capgemini.bike.domain.Person;
import com.capgemini.bike.repositories.MountainBikeRepository;
import com.capgemini.bike.repositories.PersonRepository;
import com.capgemini.bike.util.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

@Service
public class MountainBikeService {

    @Autowired
    private MountainBikeRepository mountainBikeRepository;

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private Calculator calculator;




    public MountainBike findById(long id) {

        return this.mountainBikeRepository.findOne(id);
    }

    public Iterable<MountainBike> findAll() {
        return this.mountainBikeRepository.findAll();
    }


    @Transactional
    public int foo() {
        return this.calculator.add(3,4);
    }


}
