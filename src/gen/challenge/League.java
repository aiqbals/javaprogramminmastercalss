package gen.challenge;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
	public String name;
	private ArrayList<T> league = new ArrayList<>();
	
	public League(String name) {
		this.name = name;
	}
	
	public boolean addTeam(T team) {
		if(league.contains(team)) {
			return false;
		}
		league.add(team);
		return true;
	}
	
	public void showLeagueTable() {
		Collections.sort(league);
// as we impl Comparable in Team, and used compareTo which will be used by Collection framewrk whn we r sorting
		for(T t: league) {
			System.out.println(t.getName() + ": " + t.ranking());
		}
	}
	
}
