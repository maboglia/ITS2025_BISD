package com.maboglia.spring_frutta.services;

import java.util.List;
import java.util.Set;

import com.maboglia.spring_frutta.entities.Frutta;

public interface FruttaService {

    List<Frutta> getFrutta();
    List<Frutta> getFruttaByCategoria(String categoria);
    Frutta addProdotto(Frutta f);

    Set<String> getCategorie();


}
