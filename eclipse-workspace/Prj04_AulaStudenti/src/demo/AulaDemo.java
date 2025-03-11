package demo;

import java.time.LocalDate;

import model.*;

public class AulaDemo {

	public static void main(String[] args) {

		Studente s1 = new Studente(1, "Marco", "Arneodo", LocalDate.of(2005, 6, 11));
		Studente s2 = new Studente(2, "Andrea", "Brecko", LocalDate.of(2003, 9, 27));
		
		Aula aula13 = new Aula();
		
		aula13.addStudente(s1, 0);
		aula13.addStudente(s2, 1);
		
		for (int i = 0; i < aula13.getStudenti().length; i++) {
			System.out.print("Lo studente alla posizione " + i + " ");
			System.out.println(aula13.getStudenteById(i));
			
		}

	}

}
