package com.capgemini.bike.service;

import com.capgemini.bike.domain.Person;
import com.capgemini.bike.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Transactional
    public Person createPerson(Person newPerson) {
        return this.personRepository.save(newPerson);
    }

    @Transactional
    public boolean maakGeldOver(Person sasha, Person richard, double bedrag) {

                sasha.verlaag(bedrag);
                richard.verhoog(bedrag);

                return true;


    }
}
