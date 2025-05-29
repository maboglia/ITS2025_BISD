package com.maboglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.entities.Automobile;
import com.maboglia.repos.AutomobileRepo;

@Service
public class AutosaloneServiceImpl implements AutosaloneService {

	@Autowired
	private AutomobileRepo repoAuto;
	
	@Override
	public Automobile addAuto(Automobile a) {
		return repoAuto.save(a);
	}

	@Override
	public List<Automobile> getAutomobili() {
		return repoAuto.findAll();
	}

}
