package services;

import java.util.ArrayList;
import java.util.List;

import entities.Film;
import repos.FilmDAO;
import repos.FilmDAOImpl;

public class FilmServiceImpl implements FilmService {

	private FilmDAO dao = new FilmDAOImpl();//mi collego al DAO e ottengo i film
	
	@Override
	public List<Film> getFilms() {
		
//		List<Film> lista = new ArrayList<>(dao.getFilms().values());
//		
//		return lista;
		
		return new ArrayList<>(dao.getFilms().values());
	}

	@Override
	public Film getFilmById(int id) {
		return dao.getFilms().get(id);
	}

	
	


}
