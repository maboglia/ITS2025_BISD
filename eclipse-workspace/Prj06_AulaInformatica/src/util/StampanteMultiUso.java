package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StampanteMultiUso {

	static Scanner scanner;
	static PrintWriter stampante;
	
	public static void stampaSuFile(String pathName, List<String> daStampare) {
		try {
			//inizializzo la stampante
			stampante = new PrintWriter(new File(pathName));
			
			for (String riga : daStampare) {
				stampante.println(riga);//stampo ogni riga sul file
			}
			stampante.close();//chiudo il processo di scrittura
			
		} catch (FileNotFoundException e) {
			System.err.println("Siamo spiacenti di nformarla che si è verificato un errore nella lettura del file");
			System.err.println("Il pitone morirà!");
		}
	}
	
	
	public static List<String> getRigheFile(String pathName){
		List<String> righeFile = new ArrayList<String>();
		
		try {
			scanner = new Scanner(new File(pathName));
			
			while (scanner.hasNextLine()) {
				righeFile.add(scanner.nextLine());
			}
			
		} catch (FileNotFoundException e) {
			System.err.println("Siamo spiacenti di nformarla che si è verificato un errore nella lettura del file");
			System.err.println("Il pitone morirà!");
		}
		
		
		
		
		return righeFile;
		
	}
	
}
