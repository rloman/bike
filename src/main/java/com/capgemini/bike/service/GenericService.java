package com.capgemini.bike.service;

import com.capgemini.bike.domain.MountainBike;
import com.capgemini.bike.domain.Person;
import com.capgemini.bike.repositories.MountainBikeRepository;
import com.capgemini.bike.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Service
public class GenericService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private MountainBikeRepository mountainBikeRepository;

    @PostConstruct
    @Transactional
    public void init() {

        {

            Person p = new Person();
            // hier is p een detached variabele


            this.personRepository.save(p);

            // hier is p een attached variable

            MountainBike b1 = new MountainBike();
            b1.setMerk("Canyon");
            b1.setModel("Spectral");
            b1.setPrice(Math.random() * 3000);

            b1.setOwner(p);

            this.mountainBikeRepository.save(b1);


            for (MountainBike element : this.mountainBikeRepository.findAllByMerk("Batavus")) {

                element.setMerk("Jansen");
                this.mountainBikeRepository.save(element);
            }

        }

        {
            MountainBike b1 = new MountainBike();
            b1.setMerk("Canyon");
            b1.setModel("Spectral");
            b1.setPrice(Math.random() * 3000);

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
            b1.setPrice(Math.random() * 3000);

            this.mountainBikeRepository.save(b1);


            Person p = new Person();
            this.personRepository.save(p);

            b1.setOwner(p);

            this.personRepository.save(p);
            this.mountainBikeRepository.save(b1);
        }

        Person p = this.personRepository.findOne(1L);

        System.err.println(p.getBikes());


        for (MountainBike b : p.getBikes()) {
            System.err.println(b.getMerk());
        }
    }
}


