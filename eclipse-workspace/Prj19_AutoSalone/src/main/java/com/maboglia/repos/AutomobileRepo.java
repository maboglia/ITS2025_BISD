package com.maboglia.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maboglia.entities.Automobile;

@Repository
public interface AutomobileRepo extends JpaRepository<Automobile, Integer> {

    List<Automobile> findByMarca(String marca);

}
