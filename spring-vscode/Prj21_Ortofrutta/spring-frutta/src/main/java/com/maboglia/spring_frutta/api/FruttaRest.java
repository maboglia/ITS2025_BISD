package com.maboglia.spring_frutta.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maboglia.spring_frutta.entities.Frutta;
import com.maboglia.spring_frutta.services.FruttaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("api")
public class FruttaRest {

    @Autowired
    private FruttaService service;

    @GetMapping("frutta")
    public ResponseEntity<List<Frutta>> getProdotti(){

        return new ResponseEntity<>(service.getFrutta(), HttpStatus.OK);


    }

    @PostMapping("frutta")
    public ResponseEntity<Frutta> addFrutto(@RequestBody Frutta frutta) {
        return new ResponseEntity<>(service.addProdotto(frutta), HttpStatus.CREATED);
    }
    

    @GetMapping("categoria/{categoria}")
    public ResponseEntity<List<Frutta>> getProdotti(@PathVariable String categoria){

        return new ResponseEntity<>(service.getFruttaByCategoria(categoria), HttpStatus.OK);

    }

    @GetMapping("disponibilita")
    public List<String> getDisponibilita() {
        return List.of("Alta", "Media", "Bassa", "Infinita", "Manco uno");
    }
    

}
