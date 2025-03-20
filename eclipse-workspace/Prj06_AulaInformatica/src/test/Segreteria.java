package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import controller.Aula;
import controller.Registro;
import model.Studente;
import util.StampanteMultiUso;

public class Segreteria {

	public static void main(String[] args) {

		List<String> righe = StampanteMultiUso
			.getRigheFile("documenti/studenti.txt");
		Registro r = new Registro("ITS 2025 BID");
		initRegistro(righe, r);
		
		Aula aula = new Aula("La terribile aula 13", r);
		
		//aula.faiAppello();
		
		List<String> codiceHtml = new ArrayList<String>();
		
		codiceHtml.add("<table>");
		codiceHtml.add("<tr><th>Nome</th><th>Cognome</th></tr>");
		
		for(Studente s : r.getStudenti()) {
			codiceHtml.add("<tr><td>"+s.getNome()+"</td><td>"+s.getCognome()+"</td></tr>");
		}
		codiceHtml.add("</table>");		
		
		StampanteMultiUso.stampaSuFile("documenti/studenti.html", codiceHtml);
		
	}

	private static void initRegistro(List<String> righe, Registro r) {
		
		
		
		for(String riga : righe) {
			String[] parole =  riga.split(",");
			
			String nome = parole[0];
			String cognome = parole[1];
			String dataNascita = parole[2];
			LocalDate dataVera = LocalDate.parse(dataNascita);
			
			Studente s = new Studente(nome, cognome, dataVera);
			r.addStudente(s);
			//System.out.println(s);
			
		}
	}

}
