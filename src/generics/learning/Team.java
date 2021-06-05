package generics.learning;
import java.util.ArrayList;

//******* adding parameterized type instead of specific type e.g., player
//public class Team<T> { // Accept any type
public class Team<T extends Player> implements Comparable<Team<T>> { 
	// Accept any type that extend Player. Player is upper bound of T. 
	// When impelenting interface Comparable that has type Team that has type T so that it provides 
	// error in compile time when compare between two diff type of team e.g., foobal vs soccer
// public class Team<T extends Player & Coach & Manager> { 
	// when implementing interfaces or multiple bounds, Remember, class always first thn Interface
	private String teamName;
	int played = 0;
	int won = 0;
	int lost = 0;
	int tied = 0;
	
	public Team(String name) {
		this.teamName = name;
	} // Set teamName
	
	public String getName() {
		return teamName;
	} // Get the teamName
	
	private ArrayList<T> members = new ArrayList<>();
	// Player type ArrayList, only Player class data will be added here using members obj
	
	public boolean addPlayer(T player) {
		if(members.contains(player)) {
			//System.out.println(((Player) player).getName() + " is already on this team");
			// need to cast to (Player) type as player is Palyer object. It's a pretty ugly cast
			System.out.println(player.getName() + " is already on this team");
			// Got-rid of ugly cast once T type extends Player
			return false;
		} else {
			members.add(player);
			System.out.println(player.getName() + " picked for team " + this.teamName);
			return true;
		}
	}
	
	public int numPlayers() {
		return this.members.size();
	}
	
	public void mathchResult(Team<T> opponent, int ourScore, int theirScore) {
		String msg;
		
		if(ourScore > theirScore) {
			won++;
			msg = " beat ";
		} else if(ourScore == theirScore) {
			tied++;
			msg = "drew with ";
		} else {
			lost++;
			msg = "lost to ";
		}
		played++;
		if(opponent != null) {
			System.out.println(this.getName() + msg + opponent.getName());
			opponent.mathchResult(null, theirScore, ourScore);
		}
	}
	
	public int ranking() {
		return (won * 2) + tied;
	}
	
	@Override
	public int compareTo(Team<T> team) {
		if(this.ranking() > team.ranking()) {
			return -1;
		} else if(this.ranking() < team.ranking()) {
			return 1;
		}
		return 0;
	}
	
}

//******* adding specific type e.g., player to ArrayList *************
//public class Team {
//	private String teamName;
//	int played = 0;
//	int won = 0;
//	int lost = 0;
//	int tied = 0;
//	
//	public Team(String name) {
//		this.teamName = name;
//	}
//	
//	private ArrayList<Player> members = new ArrayList<>();
//	// Player type arraylist, only Player data can be added to this ArrayList
//	
//	public String getName() {
//		return teamName;
//	}
//	
//	public boolean addPlayer(Player player) {
//		if(members.contains(player)) {
//			System.out.println(player.getName() + " is already on this team");
//			return false;
//		} else {
//			members.add(player);
//			System.out.println(player.getName() + " picked for team " + this.teamName);
//			return true;
//		}
//	}
//	
//	public int numPlayers() {
//		return this.members.size();
//	}
//	
//	public void mathchResult(Team opponent, int ourScore, int theirScore) {
//		if(ourScore > theirScore) {
//			won++;
//		} else if(ourScore == theirScore) {
//			tied++;
//		} else {
//			lost++;
//		}
//		played++;
//		if(opponent != null) {
//			opponent.mathchResult(null, theirScore, ourScore);
//		}
//	}
//	
//	public int ranking() {
//		return (won * 2) + tied;
//	}
//}

