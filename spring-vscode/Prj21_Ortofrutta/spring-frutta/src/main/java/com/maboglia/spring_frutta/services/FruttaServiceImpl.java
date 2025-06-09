package com.maboglia.spring_frutta.services;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.spring_frutta.entities.Frutta;
import com.maboglia.spring_frutta.repos.FruttaRepo;

@Service
public class FruttaServiceImpl implements FruttaService{

    @Autowired
    private FruttaRepo repo;

    @Override
    public List<Frutta> getFrutta() {
        return repo.findAll();
    }

    @Override
    public List<Frutta> getFruttaByCategoria(String categoria) {
        return repo.findByCategoria(categoria);
    }

    @Override
    public Frutta addProdotto(Frutta f) {
        return repo.save(f);
    }

    @Override
    public Set<String> getCategorie() {

        List<String> categorie =  getFrutta()
            .stream()
            .map(p -> p.getCategoria())
            //.distinct()
            //.sorted()
            .toList();

        return new TreeSet<>(categorie);

    }

}
