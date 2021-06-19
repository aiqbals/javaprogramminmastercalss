package Encapsulationlearning;

public class PlayerWithEncap {
	private String name;
	private int health = 100;
	private String weapon;
	//restricting direct access to the field; Constructor can be used to change field val.
	
	public PlayerWithEncap(String name, int health, String weapon) {
		this.name = name;
		if(health > 0 && health <=100) {
			this.health = health;
		}
		this.weapon = weapon;
	} 
	// Using constructor to change the filed instead of directly changing field

	public void loseHealth(int damage) {
		this.health = (this.health) - damage;
		if(this.health <= 0) {
			System.out.println("Player knocked out");
		}
	}

	public int getHealth() {
		return health;
	}
}
