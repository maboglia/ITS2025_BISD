package service;

import java.util.ArrayList;
import java.util.List;

import entities.Frutto;
import entities.Prodotto;
import entities.Verdura;
import repos.ProdottoDAO;

public class OrtofruttaService {

	private List<Frutto> frutta;
	private List<Verdura> verdura;
	
	private ProdottoDAO dao = new ProdottoDAO();
	
	public List<Prodotto> getFrutta(){
		List<Prodotto> frutti = new ArrayList<Prodotto>();
		
		for (Prodotto p : dao.getProdotti().values()) {
//			if (p.getCategoria().equals("Frutta"))
				frutti.add(   p);
		}
		
		return frutti;
		
	}
	
}
