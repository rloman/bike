package com.capgemini.bike.service;

import com.capgemini.bike.domain.Bike;
import com.capgemini.bike.domain.Citybike;
import com.capgemini.bike.domain.MountainBike;
import com.capgemini.bike.domain.Person;
import com.capgemini.bike.repositories.BikeRepository;
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
    private BikeRepository bikeRepository;

    @PostConstruct
    @Transactional
    public void init() {

        {

            Person p = new Person();
            // hier is p een detached variabele


            this.personRepository.save(p);

            // hier is p een attached variable

            Bike b1 = new MountainBike();
            b1.setMerk("Canyon");
            b1.setModel("Spectral");
            b1.setPrice(Math.random() * 3000);

            b1.setOwner(p);

            this.bikeRepository.save(b1);


            for (Bike element : this.bikeRepository.findAllByMerk("Batavus")) {

                element.setMerk("Jansen");
                this.bikeRepository.save(element);
            }

        }

        {
            Bike b1 = new MountainBike();
            b1.setMerk("Canyon");
            b1.setModel("Spectral");
            b1.setPrice(Math.random() * 3000);

            this.bikeRepository.save(b1);


            Person p = new Person();
            this.personRepository.save(p);

            b1.setOwner(p);

            this.personRepository.save(p);
            this.bikeRepository.save(b1);
        }

        {
            Bike b1 = new MountainBike();
            b1.setMerk("Canyon");
            b1.setModel("Spectral");
            b1.setPrice(Math.random() * 3000);

            this.bikeRepository.save(b1);


            Person p = new Person();
            this.personRepository.save(p);

            b1.setOwner(p);

            this.personRepository.save(p);
            this.bikeRepository.save(b1);
        }

        {
            Bike b1 = new Citybike();
            b1.setMerk("Batavus");
            b1.setModel("City Central");
            b1.setPrice(Math.random() * 3000);



            this.bikeRepository.save(b1);


            Person p = new Person();
            this.personRepository.save(p);

            b1.setOwner(p);

            this.personRepository.save(p);
            this.bikeRepository.save(b1);
        }

        Person p = this.personRepository.findById(1L).get();

        System.err.println(p.getBikes());


        for (Bike b : p.getBikes()) {
            System.err.println(b.getMerk());
        }
    }
}


