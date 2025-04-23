package controller;

import java.util.List;

import model.Pokemon;
import service.PokemonService;

public class PokemonController {

	private PokemonService service = new PokemonService();
	
	public static void main(String[] args) {

		PokemonController ctrl = new PokemonController();
		
		List<Pokemon> lista =  ctrl.service.getAllPokemon();
		
		for (Pokemon pokemon : lista) {
			System.out.println(pokemon);
		}

	}

}
