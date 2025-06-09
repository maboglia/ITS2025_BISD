package com.maboglia.services;

import java.util.List;

import com.maboglia.entities.Automobile;
import com.maboglia.entities.Moto;

public interface AutosaloneService {

	//crud auto
	Automobile addAuto(Automobile a);
	List<Automobile> getAutomobili();
	List<Automobile> getAutoByMarca(String marca);
	Automobile updateAutomobile(Automobile a);
	void deleteAutomobile(int id);

	//crud moto
	Moto addMoto(Moto m);
	List<Moto> getMoto();
	List<Moto> getMotoByMarca(String marca);
	Moto updateMoto(Moto m);
	void deleteMoto(int id);
	
}
