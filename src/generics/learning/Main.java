package generics.learning;

public class Main {
	
	public static void main(String[] args) {
		FootballPlayer joe = new FootballPlayer("Joe");
		FootballPlayer Toe = new FootballPlayer("Toe");
		BaseballPlayer pat = new BaseballPlayer("Pat");
		SoccerPlayer beckham = new SoccerPlayer("Becham");
		
//		Team football = new Team("Football");
//		football.addPlayer(joe);
//		football.addPlayer(pat);
//		football.addPlayer(beckham);
//		// the problem is, all 3 types of player are being added in the same team 
//		// as we did not specify the parameterized type e.g., footbal in team class
		
		Team<FootballPlayer> tm1 = new Team<>("Team1");
		tm1.addPlayer(joe);
		Team<FootballPlayer> tm2 = new Team<>("Team2");
		tm2.addPlayer(Toe);
		Team<FootballPlayer> tm3 = new Team<>("Team3");
		// football.addPlayer(pat);// will not be added as pat is Baseball type player
		//System.out.println(tm1);
		//System.out.println(tm1.numPlayers());
		
		Team<BaseballPlayer> baseball = new Team<>("Baseball");
		baseball.addPlayer(pat);
		
		Team<SoccerPlayer> soccer = new Team<>("Soccer");
		soccer.addPlayer(beckham);
		
		// we should be able to use any type e.g. String except primitive type e.g., int
		//Team<String> brokentm = new Team<>("won't work"); // cant be cast to Player we added in Team
		//brokentm.addPlayer("no team");
		// Since String type dont extend Player, it wont gives compilation err
		
		tm1.mathchResult(tm2, 1, 0);
		//tm2.mathchResult(baseball, 1, 0); // compile err due to diff type team
		
		System.out.println("Rankings");
		System.out.println(tm1.getName() + ": " + tm1.ranking());
		System.out.println(tm2.getName() + ": " + tm2.ranking());
		System.out.println(tm3.getName() + ": " + tm3.ranking());
		
		System.out.println(tm1.compareTo(tm2));
		System.out.println(tm2.compareTo(tm3));
	}
}
