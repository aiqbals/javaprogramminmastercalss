package operators.keywords.expression.methos;

public class MethodOverload {
	public static void main(String[] args) {
//		calculateScore("Asif", 500);
//		calculateScore("A", 500, 5555);
//		calculateScore();
//		//System.out.println("Hello");
		
//		calcFtAndIncToCm(6, 0);
//		calcFtAndIncToCm(6, -1);
		calcFtAndIncToCm(100);
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
	public static double calcFtAndIncToCm(double feet, double inches) {
		if(feet < 0 || ((inches < 0) || (inches > 12))){
			System.out.print(" Invalid ");
			return -1;
		}
		
		double cm = (feet * 12) * 2.54;
		cm += inches * 2.54;
		System.out.print(feet + " feet, " + inches + " inches = " + cm + " cm");
		return cm;
	}
	
	// Ch-1
	public static double calcFtAndIncToCm(double inches) {
		if(inches < 0){
			System.out.print(" Invalid ");
			return -1;
		}
		double ft = (inches / 12);
		double remainingInch = inches % 12;
		System.out.print(inches + " Inches is equal to  " + ft + " feet and "+ remainingInch + " inch ");
		return calcFtAndIncToCm(ft, remainingInch);
	}
}

// Same method name with diff parameter type or perameter no. Method must have unique signature
