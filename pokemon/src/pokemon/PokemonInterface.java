package pokemon;

public interface PokemonInterface {
	default Pokemon createPokemon(String name, int health, String type) {
		Pokemon p = new Pokemon(name,health,type);
		return p;
	}
	
	static String pokemonInfo(Pokemon p) {
		return p.toString();
	}
	default void listPokemon() {
		
	}
}
