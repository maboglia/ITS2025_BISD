package com.maboglia.libreria_spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.maboglia.libreria_spring.entities.Libro;
import com.maboglia.libreria_spring.services.LibreriaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;





@Controller
public class LibreriaMVC {

    @Autowired
    private LibreriaService service;//IOC Inversion of Control

    @GetMapping("")
    public String home(Model m) {
                m.addAttribute("titolo", "La libreria sempre aperta");
        return "index";
    }
    

    @GetMapping("libri")
    public String getLibri(Model m) {//Dependency Injection
        m.addAttribute("titolo", "I  più bei libri del mondo");
        m.addAttribute("generi", service.getGeneri());
        m.addAttribute("libri", service.getLibri());
        return "vista_libri";
    }
    
    @PostMapping("libri")
    public String addLibro(Libro l) {
        
        service.addLibro(l);
        
        return "redirect:/libri";
    }
    

}
