package com.maboglia.spring_frutta.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "prodotti_ortofrutticoli")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Frutta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private String categoria;
    private String origine;
    private double prezzoKg;
    private String disponibilita;


}
