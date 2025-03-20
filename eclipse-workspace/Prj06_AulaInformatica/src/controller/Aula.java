package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
	
	public void faiAppello() {
		Scanner scanner = new Scanner(System.in);
		for (Studente s : registro.getStudenti()) {
			
			System.out.println("E' presente lo studente");
			System.out.println(s +  "?");
			
			String risposta = scanner.nextLine();
			
			if (risposta.equalsIgnoreCase("S"))
				this.presenti.add(s);
			else
				this.assenti.add(s);
			
		}
		
		System.out.println("I presenti sono " + this.presenti.size());
		System.out.println("Gli assenti sono " + this.assenti.size());
		
		
		
	}
	
	
	
	
}
