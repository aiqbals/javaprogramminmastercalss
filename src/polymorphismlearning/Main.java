package polymorphismlearning;

class Movie {
	private String name;

	public Movie(String name) {
		this.name = name;
	}
	
	public String plot() {
		return "No plot here";
	}
}

class Jaws extends Movie  {
	public Jaws() {
		super("Jaws");
	}
	
	public String plot() {
		return "A shark eats lots of people";
	}
}

class IndependenceDay extends Movie {
	public IndependenceDay() {
		super("Independence Day");
	}

	@Override
	public String plot() {
		return "Aliens attempt to take over planet earth";
	}
}

class MozeRunner extends Movie {
	public MozeRunner() {
		super("Maze Runner");
	}

	@Override
	public String plot() {
		return "Kids try and escape a maze";
	}
}

class StarWars extends Movie {
	public StarWars() {
		super("Star Wars");
	}

	@Override
	public String plot() {
		return "Imperial Forces try to take over the universe";
	}
}

class ForgetableMovie extends Movie {
	public ForgetableMovie() {
		super("Forgetable");
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


