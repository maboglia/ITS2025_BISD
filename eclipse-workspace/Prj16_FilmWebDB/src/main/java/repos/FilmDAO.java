package repos;

import java.util.Map;

import entities.Film;

public interface FilmDAO {

	String FIND_ALL = "SELECT * FROM IMDB_top_top250"; 
	
	Map<Integer, Film> getFilms();
	
}
