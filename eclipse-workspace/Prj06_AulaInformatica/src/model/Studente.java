package model;

import java.time.LocalDate;

public class Studente {

	private static int counter = 1;
	
	private int id;
	private String nome;
	private String cognome;
	private LocalDate dataNascita;
	
	public Studente(String nome, String cognome) {
		this.id = counter++;
		this.nome = nome;
		this.cognome = cognome;	
	}
	
	public Studente(String nome, String cognome, LocalDate dataNascita) {
		this(nome, cognome);
		this.dataNascita = dataNascita;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}

	@Override
	public String toString() {
		return "Studente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", dataNascita=" + dataNascita + "]";
	}
	
	//getters, setters
	
	
}
