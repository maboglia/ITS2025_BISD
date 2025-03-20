package controller;

import java.util.ArrayList;
import java.util.List;

import model.Studente;

public class Registro {

	private String nome;
	private List<Studente> studenti;//interface
	
	public Registro(String nome) {
		this.nome = nome;
		this.studenti = new ArrayList<Studente>();//class
	}
	
	public void addStudente(Studente s) {
		this.studenti.add(s);
	}
	
	public Studente getStudente(int id) {
		for (Studente s : studenti) {
			if (s.getId() == id)
				return s;
		}
		
		return null;
	}
	public Studente getStudente(String cognome) {
		for (Studente s : studenti) {
			if (s.getCognome().equals(cognome))
				return s;
		}
		return null;
	}
	
	public List<Studente> getStudenti() {
		return studenti;
	}
	
}
