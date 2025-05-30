package com.maboglia.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maboglia.entities.Automobile;
import com.maboglia.entities.Moto;
import com.maboglia.services.AutosaloneService;

@RestController
@RequestMapping("api")
public class AutosaloneREST {

	@Autowired
	private AutosaloneService service;
	
	@GetMapping("automobili")
	@CrossOrigin(origins = "*")
	public List<Automobile> getAuto(){
		return service.getAutomobili();
	}
	
	@PostMapping("automobili")
	public Automobile addAuto(@RequestBody Automobile a) {
		return service.addAuto(a);
	}
	
	@PutMapping("automobili/{id}")
	public Automobile updAutomobile(@PathVariable int id, @RequestBody Automobile a){
		return service.updateAutomobile(a);
	}

	@DeleteMapping("automobili/{id}")
	public ResponseEntity<String> deleteAutomobile(@PathVariable int id){
		service.deleteAutomobile(id);
		return new ResponseEntity<String>("Eliminato", HttpStatus.NO_CONTENT);
	}
	
	@GetMapping("moto")
	public List<Moto> getMoto(){
		return service.getMoto();
	}


	@PostMapping("moto")
	public Moto addMoto(@RequestBody Moto m) {
		return service.addMoto(m);
	}
	

	@PostMapping("tantemoto")
	public List<Moto> addTanteMoto(@RequestBody List<Moto> lista) {

		for (Moto moto : lista) {
			service.addMoto(moto);
		}

		return service.getMoto();
	}
	
	
}
