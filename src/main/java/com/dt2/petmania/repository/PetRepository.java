package com.dt2.petmania.repository;

import com.dt2.petmania.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  PetRepository extends JpaRepository<Pet, Long> {

}
