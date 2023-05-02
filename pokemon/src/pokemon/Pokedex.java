package pokemon;

public class Pokedex extends AbstractPokemon{

	private int myPokemons;

	public Pokedex() {
		
	}
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon p = new Pokemon(name,health,type);
		myPokemons++;
		return p;
	}
	
	public void listPokemon() {
		System.out.println("Pokedex: " + myPokemons);	
	}
}
