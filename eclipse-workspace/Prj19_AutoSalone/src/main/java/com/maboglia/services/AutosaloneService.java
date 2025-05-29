package com.maboglia.services;

import java.util.List;

import com.maboglia.entities.Automobile;

public interface AutosaloneService {

	Automobile addAuto(Automobile a);
	List<Automobile> getAutomobili();
	
}
