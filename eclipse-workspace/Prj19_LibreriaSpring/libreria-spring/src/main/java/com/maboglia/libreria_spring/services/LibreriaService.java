package com.maboglia.libreria_spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.libreria_spring.entities.Libro;
import com.maboglia.libreria_spring.repos.LibriDAO;

@Service
public class LibreriaService {

    @Autowired
    private LibriDAO dao;

    public List<String> getGeneri(){

       return List.of("romanzo", "fantascienza", "giallo", "saggio");

    }

    public List<Libro> getLibri(){
        return dao.findAll();
    }


}
