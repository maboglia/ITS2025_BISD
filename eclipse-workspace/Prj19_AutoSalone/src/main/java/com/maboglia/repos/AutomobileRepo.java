package com.maboglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maboglia.entities.Automobile;

public interface AutomobileRepo extends JpaRepository<Automobile, Integer> {

}
