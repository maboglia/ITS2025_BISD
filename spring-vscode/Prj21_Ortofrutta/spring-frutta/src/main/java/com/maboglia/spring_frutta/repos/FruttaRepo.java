package com.maboglia.spring_frutta.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maboglia.spring_frutta.entities.Frutta;

public interface FruttaRepo extends JpaRepository<Frutta, Integer>{

    List<Frutta> findByCategoria(String categoria);

}
