package services;

import java.util.List;

import entities.Automobile;

public interface AutomobileService {

	List<Automobile> getAutomobili();
	List<Automobile> getAutomobiliByMarca(String marca);
	List<Automobile> getAutomobiliByPrezzo(double min, double max);
	
	Automobile getAutomobileById(int id);
	
	void addAutomobile(Automobile a);
	
}
