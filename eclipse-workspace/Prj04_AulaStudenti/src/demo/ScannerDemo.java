package demo;

import java.io.FileNotFoundException;

import util.MioScanner;

public class ScannerDemo {

	public static void main(String[] args) throws FileNotFoundException {


		MioScanner ms = new MioScanner();
//		
//		String nome = ms.rispondiAllaDomanda("Ciao, come ti chiami?");
//		String cognome = ms.rispondiAllaDomanda("e di cognome?");
//		
//		System.out.println("Benvenuto " + nome + " " + cognome );
		
		String[] studenti =  ms.leggiFile("documenti/studenti.txt");
		
		for (String studente : studenti) {
			System.out.println(studente);
		}
		
		
		
		
		

	}

}
