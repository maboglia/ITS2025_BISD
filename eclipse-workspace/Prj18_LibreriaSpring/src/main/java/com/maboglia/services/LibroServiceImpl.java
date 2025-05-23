package com.maboglia.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maboglia.entities.Libro;
import com.maboglia.repos.LibroDAO;

@Service
public class LibroServiceImpl implements LibroService {

	@Autowired
	private LibroDAO dao;
	
	@Override
	public List<Libro> getLibri() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Libro getLibroById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Libro addLibro(Libro l) {
		// TODO Auto-generated method stub
		return dao.save(l);
	}

}
