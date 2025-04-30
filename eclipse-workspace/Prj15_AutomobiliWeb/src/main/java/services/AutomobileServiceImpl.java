package services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Automobile;
import repos.AutomobileDAO;
import repos.AutomobileDAOImpl;

public class AutomobileServiceImpl implements AutomobileService {

	private AutomobileDAO dao = new AutomobileDAOImpl();
	
	@Override
	public List<Automobile> getAutomobili() {
		
		try {
			return new ArrayList<Automobile>(dao.getAutomobili().values());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Automobile> getAutomobiliByMarca(String marca) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Automobile> getAutomobiliByPrezzo(double min, double max) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Automobile getAutomobileById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addAutomobile(Automobile a) {
		// TODO Auto-generated method stub

	}

}
