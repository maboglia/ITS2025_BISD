package com.maboglia.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.maboglia.entities.Automobile;
import com.maboglia.entities.Moto;
import com.maboglia.entities.Veicolo;
import com.maboglia.services.AutosaloneService;

import jakarta.servlet.http.HttpSession;

@Controller
public class AutosaloneMVC {

	@Autowired
	private AutosaloneService service;
	
	@GetMapping("auto")
	public String getAutomobili(Model m, HttpSession session) {
		
		//session.setAttribute("timing", "è ora di andare a mangiare qualcosa!!!");
		m.addAttribute("titolo", "Le nostre auto in promozione");
		m.addAttribute("veicoli", service.getAutomobili());
		
		return "veicoli";
	}
	
	@GetMapping("auto/add")
	public String addAuto(Model m){
		
		m.addAttribute("titolo", "Aggiungi una nuova automobile");
		m.addAttribute("btnadd", "Aggiungi automobile");
		m.addAttribute("tipo", "auto");

		return "form";
	}
	
	@GetMapping("moto/add")
	public String addMoto(Model m){
		
		m.addAttribute("titolo", "Aggiungi una nuova moto");
		m.addAttribute("btnadd", "Aggiungi moto");
		m.addAttribute("tipo", "moto");

		return "form";
	}

	@GetMapping("moto")
	public String getMoto(Model m) {
		
		m.addAttribute("titolo", "Le nostre moto in offerta");
		m.addAttribute("veicoli", service.getMoto());
		
		return "veicoli";
	}

	@PostMapping("add/moto")
	public String addMoto(Moto m){
		service.addMoto(m);
		return "redirect:moto/add";
	}


	
	@PostMapping("add")
	public String addVeicolo(@RequestParam("tipo") String tipo, Automobile a){


		service.addAuto(a);
		System.out.println(tipo);
		/*
		if (tipo.equals("auto")){
			//Automobile a = (Automobile) v;
			System.out.println("----------------------------------------------------------------");
			System.out.println(v);
			System.out.println("---------------------------------------------------------------");
			service.addAuto((Automobile) v);
		} 
		else if (tipo.equals("moto")){ 
			service.addMoto((Moto) v);
		} 
		else {
			System.out.println("Non sono riuscito ad aggiungere il veicolo " + v);
		}
		*/
		return "redirect:auto/add";
	}

	
}
