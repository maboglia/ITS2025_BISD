package com.maboglia.spring_frutta.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.maboglia.spring_frutta.entities.Frutta;
import com.maboglia.spring_frutta.services.FruttaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class FruttaMVC {

    @Autowired
    private FruttaService service;

    @GetMapping("/categoria/{categoria}")
    public String getByCat(@PathVariable String categoria,   Model m) {

        m.addAttribute("titolo", "I nostri prodotti " + categoria);
        m.addAttribute("prodotti", service.getFruttaByCategoria(categoria));

        return "index";
    }
    

    @GetMapping("/")
    public String home(Model m) {

        m.addAttribute("titolo", "I nostri prodotti ortofrutticoli");
        m.addAttribute("prodotti", service.getFrutta());

        return "index";
    }
    
    @GetMapping("add")
    public String addForm(Model m) {
        m.addAttribute("titolo", "Aggiungi un nuovo prodotto");
        m.addAttribute("categorie", service.getCategorie());
        return "form";
    }
    
    @PostMapping("add")
    public String addProdotto(Frutta f) {
        
        service.addProdotto(f);
        
        return "redirect:/";
    }
    


}
