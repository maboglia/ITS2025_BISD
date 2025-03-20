package controller;

import java.util.ArrayList;
import java.util.List;

import model.Studente;

public class Aula {

	private String nome;
	private Registro registro;
	private List<Studente> assenti;
	private List<Studente> presenti;
	
	public Aula(String nome, Registro registro) {
		this.nome = nome;
		this.registro = registro;
		this.assenti = new ArrayList<Studente>();
		this.presenti = new ArrayList<Studente>();
	}
	
	
	
	
	
	
}
