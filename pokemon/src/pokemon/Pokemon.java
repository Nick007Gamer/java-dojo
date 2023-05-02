package pokemon;

public class Pokemon {
	//name, health y type
	
	private String name;
	private int health;
	private String type;
	static int count;
	
	public Pokemon(String name, int health, String type) {
		this.name = name;
		this.health = health;
		this.type= type;
		count++;
	}
	
	
	public void attackPokemon(Pokemon p) {
		System.out.println(this.name + " ha atacado a " + p.getName() + " inflingiendo 10 de daño");
		p.setHealth(p.getHealth() - 10);
		
	}
	
	public int getCount() {
		return this.count;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public int getHealth() {
		return health;
	}


	@Override
	public String toString() {
		return "Pokemon [name=" + name + ", health=" + health + ", type=" + type + "]";
	}
	
	
	
	
}
