package gen.challenge;

public abstract class Player {
	private String name;
	
	public Player(String name) {
		this.name = name;
	} // set the player name
	

	public String getName() {
		return name;
	} // get the palyer name
}