package model;

public class Veicolo implements Comparable<Veicolo> {

	String nome;
	String marca;
	private double prezzo;
	
	public Veicolo() {
		this.nome = "Veicolo";
		this.marca = "generica";
	}
	
	public void setPrezzo(double prezzo) {
		if (prezzo > 5) {
			this.prezzo = prezzo;
		} else {
			System.out.println("Prezzo non modificato");
		}	
	}
	
	public double getPrezzo() {
		return prezzo;
	}
	
	@Override
	public String toString() {
		return "Veicolo [nome=" + nome + ", marca=" + marca + ", prezzo=" + prezzo + "]";
	}

	@Override
	public int compareTo(Veicolo altroVeicolo) {

		if (this instanceof Bicicletta)
			return -1;
		if (this instanceof Motocicletta && altroVeicolo instanceof Bicicletta)
			return 1;
		if (this instanceof Automobile)			
			return 1;
		return 0;
	}
	
}
