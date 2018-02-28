package com.capgemini.bike.service;

import com.capgemini.bike.domain.MountainBike;
import com.capgemini.bike.repositories.MountainBikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

@Service
@Transactional
public class MountainBikeService {

    @Autowired
    private MountainBikeRepository mountainBikeRepository;


    @PostConstruct
    public void init() {
        MountainBike b1 = new MountainBike();
        b1.setMerk("Canyon");
        b1.setModel("Spectral");
        b1.setPrice(3000.00);

        this.mountainBikeRepository.save(b1);
    }



    public MountainBike findById(long id) {

        return this.mountainBikeRepository.findOne(id);
    }

    public Iterable<MountainBike> findAll() {
        return this.mountainBikeRepository.findAll();
    }


}
