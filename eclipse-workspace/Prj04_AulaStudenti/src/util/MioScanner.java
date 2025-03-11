package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MioScanner {

	private Scanner scanner = new Scanner(System.in);
			
	public String rispondiAllaDomanda(String domanda) {
		System.out.println(domanda);
		
		String risposta = scanner.nextLine();
		
		return risposta;
	}		
	
	public String[] leggiFile(String nomeFile) throws FileNotFoundException {
		String[] righe = new String[30];
		File temp = new File(nomeFile);
		scanner = new Scanner(temp);
		
		int indice = 0;
		while (scanner.hasNextLine()) {
			String riga = scanner.nextLine();
			righe[indice++] = riga;
		}
		
		return righe;
				
		
	}
	
	
}
