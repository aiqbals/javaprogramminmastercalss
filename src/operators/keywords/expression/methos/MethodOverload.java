package operators.keywords.expression.methos;

public class MethodOverload {
	public static void main(String[] args) {
//		calculateScore("Asif", 500);
//		calculateScore("A", 500, 5555);
//		calculateScore();
//		//System.out.println("Hello");
		
		calcFtAndIncTom(6, 0);
		calcFtAndIncTom(6, -1);
	}
	
	public static int calculateScore(String playerName, int score) {
		System.out.print("Player " + playerName + " Score " + score + " points");
		return score * 1000;
	}
	
	public static int calculateScore(String playerName, int score, int score2) {
		System.out.print(" Player 2nd score is " + score2);
		return score2;
	}
	
	public static int calculateScore() {
		System.out.print(" Player");
		return 0;
	}
	
	// Ch-1
	public static double calcFtAndIncTom(double feet, double inches) {
		if(feet >= 0 || ((inches >= 0) && (inches <= 12))){
			double cm = (feet * 12) * 2.54;
			cm += inches * 2.54;
			System.out.print(feet + " feet, " + inches + " inches = " + cm + " cm");
			return cm;
		}
		System.out.print(" Invalid ");
		return -1;
	}
	
	// Ch-1
	public static double calcFtAndIncTom(double inches) {
		if(inches < 0){
			System.out.print(" Invalid ");
			return -1;
		}
		double inch = (inches * 0.0833333);
		
		return inch;
	}
}

// Same method name with diff parameter type or perameter no. Method must have unique signature
