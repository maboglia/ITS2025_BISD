package repos;

import java.sql.SQLException;
import java.util.Map;

import entities.Automobile;

public interface AutomobileDAO {

	String FIND_ALL = "SELECT * FROM automobili";
	String ADD = "INSERT INTO automobili (marca, modello, cilindrata, posti, prezzo) VALUES (?,?,?,?,?)";
	
	Map<Integer, Automobile> getAutomobili() throws SQLException;
	void addAutomobile(Automobile a) throws SQLException;
	
	
}
