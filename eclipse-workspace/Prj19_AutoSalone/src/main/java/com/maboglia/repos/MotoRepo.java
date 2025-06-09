package com.maboglia.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.maboglia.entities.Moto;

@Repository
public interface MotoRepo extends JpaRepository<Moto, Integer> {

    List<Moto> findByMarca(String marca);

}
