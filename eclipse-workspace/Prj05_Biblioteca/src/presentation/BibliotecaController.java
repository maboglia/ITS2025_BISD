package presentation;

import java.io.FileNotFoundException;
import java.util.List;

import model.Libro;
import service.Ripiano;
import service.Scaffale;
import util.LeggiFile;

public class BibliotecaController {

	public static void main(String[] args) throws FileNotFoundException {

		
//		Libro l1 = new Libro(1,"Alchimista (L')",10,12.00);
//		Libro l2 = new Libro(2,"Marcovaldo",100,10.00);
//		Libro l3 = new Libro(3,"La colonna di fuoco",150,8.00);
		
		Scaffale scaffale1 = new Scaffale("Libri narrativa");

		Ripiano primo = scaffale1.getRipiano(0);
		
		List<String[]> righe = LeggiFile.getRighe("libri.csv");
		
		for (String[] riga : righe) {
			
			int id = Integer.parseInt(riga[0]);
			String titolo = riga[1].replaceAll("\"", "");
			int pagine = Integer.parseInt(riga[3]);
			double prezzo = Double.parseDouble(riga[2]);
			Libro l = new Libro(id, titolo, pagine, prezzo);
			primo.addLibro(l);
		}
		
		for (Libro l : primo.getLibri()) {
			System.out.println(l.getTitolo() + ": " + l.getPrezzo());
		}
		
	}

}
