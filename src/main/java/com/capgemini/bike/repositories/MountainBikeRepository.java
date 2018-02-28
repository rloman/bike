package com.capgemini.bike.repositories;

import com.capgemini.bike.domain.MountainBike;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MountainBikeRepository extends CrudRepository <MountainBike, Long> {
}
