package com.maboglia.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.maboglia.services.AutosaloneService;

import jakarta.servlet.http.HttpSession;

@Controller
public class AutosaloneMVC {

	@Autowired
	private AutosaloneService service;
	
	@GetMapping("auto")
	public String getAutomobili(Model m, HttpSession session) {
		
		session.setAttribute("timing", "è ora di andare a mangiare qualcosa!!!");
		m.addAttribute("titolo", "Le nostre auto in promozione");
		m.addAttribute("veicoli", service.getAutomobili());
		
		return "veicoli";
	}
	
	@GetMapping("moto")
	public String getMoto(Model m) {
		
		m.addAttribute("titolo", "Le nostre moto in offerta");
		m.addAttribute("veicoli", service.getMoto());
		
		return "veicoli";
	}
	
	
}
