package com.maboglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.entities.Automobile;
import com.maboglia.entities.Moto;
import com.maboglia.repos.AutomobileRepo;
import com.maboglia.repos.MotoRepo;

@Service
public class AutosaloneServiceImpl implements AutosaloneService {

	@Autowired
	private AutomobileRepo repoAuto;

	@Autowired
	private MotoRepo repoMoto;
	
	@Override
	public Automobile addAuto(Automobile a) {
		return repoAuto.save(a);
	}

	@Override
	public List<Automobile> getAutomobili() {
		return repoAuto.findAll();
	}

	@Override
	public List<Automobile> getAutoByMarca(String marca) {
		return repoAuto.findByMarca(marca);
	}

	@Override
	public Moto addMoto(Moto m) {
		return repoMoto.save(m);
	}

	@Override
	public List<Moto> getMoto() {
		return repoMoto.findAll();
	}

	@Override
	public List<Moto> getMotoByMarca(String marca) {
		return repoMoto.findByMarca(marca);
	}

}
