package repos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import entities.Film;

public class FilmDAOImpl implements FilmDAO {

	private Connessione connessione = new Connessione();
	
	private Statement statement;//contenitore per istruzioni SQL
	private ResultSet resultSet;//contenitore per risultati di una query
	
	@Override
	public Map<Integer, Film> getFilms() {

		Map<Integer, Film> mappa = new HashMap<Integer, Film>();//creo un contenitore di tipo Map
		
		try {
			statement = connessione.getConn().createStatement();//creo lo statement usando la connessione
			resultSet = statement.executeQuery(FIND_ALL);//eseguo la quey e salvo i risultati in resultSet
			
			while(resultSet.next()) {//scorro il set di risultati della query
				Film f = new Film();//creo il film f per ogni record
				f.setId(resultSet.getInt("id"));//inizializzo le proprità dell'obj
				f.setTitle(resultSet.getString("title"));
				f.setRating(resultSet.getDouble("rating"));
				f.setYear(resultSet.getInt("year"));
				
				mappa.put(f.getId(), f);//aggiungo il film f alla mappa
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return mappa;
	}

}
