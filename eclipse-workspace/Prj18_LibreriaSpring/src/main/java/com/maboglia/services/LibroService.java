package com.maboglia.services;

import java.util.List;

import com.maboglia.entities.Libro;

public interface LibroService {

	List<Libro> getLibri();
	Libro getLibroById(int id);
	Libro addLibro(Libro l);
	
}
