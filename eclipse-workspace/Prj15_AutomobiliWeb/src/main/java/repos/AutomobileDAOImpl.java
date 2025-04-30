package repos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import entities.Automobile;

public class AutomobileDAOImpl implements AutomobileDAO {

	//devo procurarmi una connessione al db
	private Connessione connessione = new Connessione();
	
	//contenitore per istruzioni SQL: Statement
	private Statement statement;
	
	//contenitore per istruzioni SQL non injectable: PreparedStatement
	private PreparedStatement ps;
	
	//per salvare in memoria i dati provenienti dal db, uso un ResultSet
	private ResultSet rs;
	
	@Override
	public Map<Integer, Automobile> getAutomobili() throws SQLException {

		Map<Integer, Automobile> map = new HashMap<>();
		
		Automobile a1 = new Automobile();
		a1.setMarca("Toyota");
		a1.setModello("Yaris");
		a1.setCilindrata(1100);
		a1.setPosti(5);
		a1.setId(1);
		a1.setPrezzo(5000);

		map.put(a1.getId(), a1);
		
		return map;
	}

	@Override
	public void addAutomobile(Automobile a) throws SQLException {
		// TODO Auto-generated method stub

	}

}
