package com.capgemini.bike.repositories;

import com.capgemini.bike.domain.MountainBike;
import com.capgemini.bike.domain.Person;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MountainBikeRepository extends CrudRepository <MountainBike, Long> {


    Iterable<MountainBike> findAllByMerkOrderByTypeAsc(String merk);


    Iterable<MountainBike>  findAllByMerk(String merk);

    Iterable<MountainBike> findAllByOwner(Person p);




}
