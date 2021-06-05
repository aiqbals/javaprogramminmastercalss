package operators.keywords.expression.methos;

public class CodeblockIfElse {
	public static void main(String[] args) {
		// If Else
		boolean gameOver = true;
		int score = 5000;
		int levelCompleted = 5;
		int bonus = 100;
		
//		if(score < 5000 && score > 1000) {
//			System.out.println("Inside Code block");
//		} else if (score == 5000){
//			System.out.println("Inside other Code block");
//		} else {
//			System.out.println("Inside other Code block");
//		}
		
		if(gameOver == true) {
			int finalScore = score + (levelCompleted * bonus);
			System.out.println(finalScore);
		}
		// var inside block can access outside var
		// Can not be accessed by outside e.g., int a = finalScore;
	}
}
