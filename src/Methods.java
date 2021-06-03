public class Methods {
	
	public static void main(String[] args) {
//		boolean gameOver = true;
//		int score = 800;
//		int levelCompleted = 5;
//		int bonus = 100;
		
//		if(gameOver == true) {
//			int finalScore = score + (levelCompleted * bonus);
//			System.out.println(finalScore);
//		}
		//calculateScore(gameOver, score, levelCompleted, bonus);
		//calculateScore(true, 800, 5, 100 );
		int highScore = calculateScore(true, 800, 5, 100 );
		System.out.println(highScore);
		
//		score = 10000;
//		levelCompleted = 8;
//		bonus = 200;
//		if(gameOver == true) {
//			int finalScore = score + (levelCompleted * bonus);
//			System.out.println(finalScore);
//		}
		//calculateScore(gameOver, score, levelCompleted, bonus);
		//calculateScore(false, 10000, 8, 200 );
		highScore = calculateScore(false, 10000, 8, 200 );
		System.out.println(highScore);
		
		
		
		int highScorePos = calculateHighScorePosition(1500);
		// return value must be stored into a variable
		displayHighScorePosition("Asif", highScorePos);
		
		highScorePos = calculateHighScorePosition(900);
		displayHighScorePosition("Aydin", highScorePos);
		
		highScorePos = calculateHighScorePosition(400);
		displayHighScorePosition("Lany", highScorePos);
		
		highScorePos = calculateHighScorePosition(50);
		displayHighScorePosition("Zeynap", highScorePos);
		
		// What if the score is exact the base case e.g., 1000 or 500 - logic hole
		// Result: use >= instead of =
		highScorePos = calculateHighScorePosition(1000);
		displayHighScorePosition("Zeynap", highScorePos);
		
	}
	
	// To avoid duplication and other cons, to clean up extra code, we can use method
//	public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//		if(gameOver == true) {
//			int finalScore = score + (levelCompleted * bonus);
//			finalScore += 1000;
//			System.out.println(finalScore);
//		}
//	}
	
	// Using return method
	public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		if(gameOver == true) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			//System.out.println(finalScore);
			return finalScore;
		} 
		
		return -1; // -1 can be used as err or value not found or invalid value
		// else can be used as well
	}
	
	public static void displayHighScorePosition(String name, int position) {
		System.out.println(name + " managed to get into position " + position + " on the high score table");
	}
	public static int calculateHighScorePosition(int score) {
//		if(score >= 1000) {
//			return 1;
//		} else if(score >= 500 && score < 1000) {
//			return 2;
//		} else if(score >= 100 && score < 500) {
//			return 3;
//		} 
//		return 4; // dlt extra code e.g., calibraces 
		// It only goes to 2nd condition when less than 1000, and so the 3rd when less 500. So,
		// Don't have to check extra condition in 2nd and 3rd condition e.g.,  && score < 1000
		
		// Otherway
		int newPosition = 4; // assuming position 4 will be returned
		if(score >= 1000) {
			newPosition = 1;
		} else if(score >= 500) {
			newPosition = 2;
		} else if(score >= 100) {
			newPosition = 3;
		}
		return newPosition;
	}
}

// Use DiffMerge tool to compare two diff code files or folders
// https://sourcegear.com/diffmerge/downloads.php
