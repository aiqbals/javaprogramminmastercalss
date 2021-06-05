package gen.challenge;

public class Main {
	
	public static void main(String[] args) {
		
		League<Team<FootballPlayer>> footballLeague = new League<>("HQ");
		Team<FootballPlayer> aydin = new Team<>("AYDIN");
		Team<FootballPlayer> lany = new Team<>("LANY");
		
		FootballPlayer asif = new FootballPlayer("Asif");
		FootballPlayer zadfar = new FootballPlayer("Zadfar");
		FootballPlayer hoque = new FootballPlayer("Hoque");
		FootballPlayer shakil = new FootballPlayer("Shakil");
		
		aydin.addPlayer(asif);
		aydin.addPlayer(hoque);
		lany.addPlayer(zadfar);
		lany.addPlayer(shakil);
		
		
		//System.out.println("Hello");
	}
}
