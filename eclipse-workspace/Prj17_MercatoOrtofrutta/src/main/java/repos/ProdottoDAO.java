package repos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import entities.Prodotto;

public class ProdottoDAO {

	private Connessione connessione = new Connessione();
	
	private Statement statement;
	
	private ResultSet rs;
	
	public Map<Integer, Prodotto> getProdotti(){
		
		Map<Integer, Prodotto> mappa = new HashMap<>();
		
		try {
			statement = connessione.getConn().createStatement();
			
			rs = statement.executeQuery("SELECT * FROM java.prodotti_ortofrutticoli");
			
			while(rs.next()) {
				
				Prodotto p = new Prodotto();
				p.setId(rs.getInt("id"));
				p.setNome(rs.getString("nome"));
				p.setPrezzoKg(rs.getDouble("prezzo_kg"));
				p.setCategoria(rs.getString("categoria"));
				
				mappa.put(p.getId(), p);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return mappa;
	}
	
	
}
