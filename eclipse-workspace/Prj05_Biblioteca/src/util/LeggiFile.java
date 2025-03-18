package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeggiFile {

	public static List<String[]> getRighe(String nomeFile) throws FileNotFoundException{
		List<String[]> righeFile = new ArrayList<String[]>();
		File mioFile = new File(nomeFile);
		Scanner input = new Scanner(mioFile);
		
		while(input.hasNextLine()) {
			String riga = input.nextLine();
			String[] sottoStringhe = riga.split(",");
			righeFile.add(sottoStringhe);
		}
		return righeFile;
	}	
}
