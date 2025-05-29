package com.maboglia.presentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.maboglia.services.AutosaloneService;

@Controller
public class AutosaloneMVC {

	@Autowired
	private AutosaloneService service;
	
	@GetMapping("auto")
	public String getAutomobili(Model m) {
		
		m.addAttribute("automobili", service.getAutomobili());
		
		return "auto";
	}
	
	
}
