package Encapsulationlearning;

public class Main {

	public static void main(String[] args) {
		PlayerWithoutEncap player = new PlayerWithoutEncap();
		player.name = "Tim";
		player.health = 20;
		player.weapon = "Sword";
		// Your are giving direct access to manually change field
		
		int damage = 10;
		player.loseHealth(damage);
		System.out.println("Remaining health for player 1 is " + player.remainingHealth());
		
		damage = 11;
		player.health = 200; // it is dangerous to change health value that you dont want
		player.loseHealth(damage);
		System.out.println("Remaining health for player 1 is " + player.remainingHealth());
		
		System.out.println("--------another player----------");
		
		PlayerWithEncap player2 = new PlayerWithEncap("Tom", 200, "AK47");
		System.out.println("Remaining health for player 2 is " + player2.getHealth());
		
		player2.loseHealth(damage);
//		player2.health = 200; // it dont allow us to change the halth value directly
		System.out.println("Remaining health for player 2 is " + player2.getHealth());
	}

}
