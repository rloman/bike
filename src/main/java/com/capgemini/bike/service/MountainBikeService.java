package com.capgemini.bike.service;

import com.capgemini.bike.domain.MountainBike;
import com.capgemini.bike.domain.Person;
import com.capgemini.bike.repositories.MountainBikeRepository;
import com.capgemini.bike.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

@Service
@Transactional
public class MountainBikeService {

    @Autowired
    private MountainBikeRepository mountainBikeRepository;

    @Autowired
    private PersonRepository personRepository;


    @PostConstruct
    public void init() {

        {

            Person p = new Person();
            // hier is p een detached variabele


            this.personRepository.save(p);

            // hier is p een attached variable

            MountainBike b1 = new MountainBike();
            b1.setMerk("Canyon");
            b1.setModel("Spectral");
            b1.setPrice(Math.random()*3000);

            b1.setOwner(p);

            this.mountainBikeRepository.save(b1);

        }

        {
            MountainBike b1 = new MountainBike();
            b1.setMerk("Canyon");
            b1.setModel("Spectral");
            b1.setPrice(Math.random()*3000);

            this.mountainBikeRepository.save(b1);


            Person p = new Person();
            this.personRepository.save(p);

            b1.setOwner(p);

            this.personRepository.save(p);
            this.mountainBikeRepository.save(b1);
        }

        {
            MountainBike b1 = new MountainBike();
            b1.setMerk("Canyon");
            b1.setModel("Spectral");
            b1.setPrice(Math.random()*3000);

            this.mountainBikeRepository.save(b1);


            Person p = new Person();
            this.personRepository.save(p);

            b1.setOwner(p);

            this.personRepository.save(p);
            this.mountainBikeRepository.save(b1);
        }

        Person p = this.personRepository.findOne(1L);

        System.err.println(p.getBikes());


        for(MountainBike b : p.getBikes()) {
            System.err.println(b.getMerk());
        }



    }



    public MountainBike findById(long id) {

        return this.mountainBikeRepository.findOne(id);
    }

    public Iterable<MountainBike> findAll() {
        return this.mountainBikeRepository.findAll();
    }


}
