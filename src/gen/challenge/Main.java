package gen.challenge;

public class Main {
	
	public static void main(String[] args) {
		
		League<Team<FootballPlayer>> footballLeague = new League<>("HQ-LG");
		Team<FootballPlayer> aydin = new Team<>("AYDIN");
		Team<FootballPlayer> lany = new Team<>("LANY");
		Team<FootballPlayer> hq = new Team<>("HQ");
		
		footballLeague.addTeam(aydin);
		footballLeague.addTeam(lany);
		footballLeague.addTeam(hq);
		
//		FootballPlayer asif = new FootballPlayer("Asif");
//		FootballPlayer zadfar = new FootballPlayer("Zadfar");
//		FootballPlayer hoque = new FootballPlayer("Hoque");
//		FootballPlayer shakil = new FootballPlayer("Shakil");
//		
//		aydin.addPlayer(asif);
//		aydin.addPlayer(hoque);
//		lany.addPlayer(zadfar);
//		lany.addPlayer(shakil);
		
		aydin.mathchResult(lany, 1, 0);
		aydin.mathchResult(hq, 1, 1);
		lany.mathchResult(hq, 3, 1);
		
		footballLeague.showLeagueTable();
		
		//System.out.println("Hello");
	}
}
