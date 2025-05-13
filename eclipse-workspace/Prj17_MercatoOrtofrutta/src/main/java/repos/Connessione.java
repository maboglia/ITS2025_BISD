package repos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {

	private final String HOST = "jdbc:mysql://localhost:3306/java";
	private final String USER = "root";
	private final String PASS = "bogliaccino";
	
	private Connection conn;
	
	private void connetti() {
		try {
			this.conn = DriverManager.getConnection(HOST, USER, PASS);
			System.out.println("Connesso al DB");
		} catch (SQLException e) {
			System.err.println("Non CONNESSO al DB");
			System.err.println(e.getMessage());
		}
	}

	public Connection getConn() {
		
		if (conn == null) connetti();
		
		return this.conn;
	}
	
}
