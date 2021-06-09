package operators.keywords.expression.methos;

public class MethodOverload {
	public static void main(String[] args) {
		calculateScore("A", 500);
		calculateScore("A", 500, 5555);
		//System.out.println("Hello");
	}
	
	public static int calculateScore(String playerName, int score) {
		System.out.print("Player " + playerName + " Score " + score + " points");
		return score * 1000;
	}
	
	public static int calculateScore(String playerName, int score, int score2) {
		System.out.print(" Player 2nd score is " + score2);
		return score2;
	}
}

// Same method name with diff parameter type or perameter no.
