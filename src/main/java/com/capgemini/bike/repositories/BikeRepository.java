package com.capgemini.bike.repositories;

import com.capgemini.bike.domain.Bike;
import com.capgemini.bike.domain.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BikeRepository extends CrudRepository <Bike, Long> {


    Iterable<Bike> findAllByMerkOrderByTypeAsc(String merk);


    Iterable<Bike>  findAllByMerk(String merk);

    Iterable<Bike> findAllByOwner(Person p);




}
