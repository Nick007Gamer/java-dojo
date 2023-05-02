package pokemon;

public class Test {

	public static void main(String[] args) {

		Pokedex pokedex = new Pokedex();
		Pokemon pikachu = pokedex.createPokemon("Pikachu", 90, "Trueno");
		Pokemon bulbasur = pokedex.createPokemon("Bulbasur",100,"planta");
		pikachu.attackPokemon(bulbasur);
		pokedex.listPokemon();
		
	}

}	
