package com.maboglia.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maboglia.entities.Automobile;
import com.maboglia.services.AutosaloneService;

@RestController
@RequestMapping("api")
public class AutosaloneREST {

	@Autowired
	private AutosaloneService service;
	
	@GetMapping("automobili")
	public List<Automobile> getAuto(){
		return service.getAutomobili();
	}
	
	@PostMapping("automobili")
	public Automobile addAuto(@RequestBody Automobile a) {
		return service.addAuto(a);
	}
	
	
	
}
