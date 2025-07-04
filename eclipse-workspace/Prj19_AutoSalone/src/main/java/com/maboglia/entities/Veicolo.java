package com.maboglia.entities;

import org.springframework.stereotype.Component;

@Component
public class Veicolo {

    protected String marca;
	protected String modello;
	protected int posti;
	protected int cilindrata;
	protected double prezzo;
    @Override
    public String toString() {
        return "Veicolo [marca=" + marca + ", modello=" + modello + ", posti=" + posti + ", cilindrata=" + cilindrata
                + ", prezzo=" + prezzo + "]";
    }

    

}
