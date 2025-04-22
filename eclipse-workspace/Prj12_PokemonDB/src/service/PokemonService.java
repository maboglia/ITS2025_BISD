package service;

import java.util.ArrayList;
import java.util.List;

import model.Pokemon;
import repos.PokemonDAO;
import repos.PokemonDAOImpl;

public class PokemonService {

	//mi collego al DAO
	private PokemonDAO dao = new PokemonDAOImpl();
	
	public List<Pokemon> getAllPokemon(){
		List<Pokemon> lista = new ArrayList<>();

		lista.addAll(dao.getPokemonMap().values());
		
		return lista;
	}
	
}
