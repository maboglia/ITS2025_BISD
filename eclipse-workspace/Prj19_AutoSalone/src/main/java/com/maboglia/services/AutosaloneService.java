package com.maboglia.services;

import java.util.List;

import com.maboglia.entities.Automobile;
import com.maboglia.entities.Moto;

public interface AutosaloneService {

	Automobile addAuto(Automobile a);
	List<Automobile> getAutomobili();
	List<Automobile> getAutoByMarca(String marca);

	Moto addMoto(Moto m);
	List<Moto> getMoto();
	List<Moto> getMotoByMarca(String marca);
	
}
