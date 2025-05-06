package services;

import java.util.List;

import entities.Film;

public interface FilmService {

	List<Film> getFilms();
	Film getFilmById(int id);
	
	
	
}
