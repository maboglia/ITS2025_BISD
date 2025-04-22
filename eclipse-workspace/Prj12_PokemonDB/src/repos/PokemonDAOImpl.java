package repos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import model.Pokemon;

public class PokemonDAOImpl implements PokemonDAO {
	
	private Connessione connessione = new Connessione();
	
	private Statement statement; // una specie di contenitore per istruizioni SQL
	private PreparedStatement ps;
	
	private ResultSet rs;//contenitore di risultati provenienti da query al db
	
	@Override
	public Map<Integer, Pokemon> getPokemonMap() {

		Map<Integer, Pokemon> mappa = new HashMap<>();//scatola vuota con forma di Map: chiave: valore
		
		try {
			statement = connessione.getConn().createStatement();
			
			rs = statement.executeQuery(FIND_ALL);
			
			while(rs.next()) {
				
				int id = rs.getInt("id");//leggo le prop della tabella
				String nome = rs.getString("nome");//leggo le prop della tabella
				String tipo1 = rs.getString("tipo1");//leggo le prop della tabella
				String tipo2 = rs.getString("tipo2");//leggo le prop della tabella
				
				Pokemon p = new Pokemon();//creo l'oggetto
				p.setId(id);//setto le prop dell'oggetto
				p.setNome(nome);
				p.setTipo1(tipo1);
				p.setTipo2(tipo2);

				mappa.put(p.getId(), p);//metto l'oggetto nella mappa
				
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return mappa;
	}

	@Override
	public void addPokemon(Pokemon p) {
		// TODO Auto-generated method stub

	}

}
