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
		calculateScore(false, 10000, 8, 200 );
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
}
