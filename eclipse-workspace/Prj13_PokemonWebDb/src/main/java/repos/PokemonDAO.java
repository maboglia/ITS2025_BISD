package repos;

import java.util.Map;

import model.Pokemon;

public interface PokemonDAO {

	//solo proprietà costanti e public
	
	String FIND_ALL = "SELECT * FROM pokemon";
	
	String ADD = "INSERT INTO pokemon (Name, `Type 1`, `Type 2`) VALUES (?,?,?)";
	
	//metodi senza corpo: astratti e public
	
	Map<Integer, Pokemon> getPokemonMap();
	
	void addPokemon(Pokemon p);
}
