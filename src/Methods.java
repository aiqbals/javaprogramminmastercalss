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
		calculateScore(true, 800, 5, 100 );
		
//		score = 10000;
//		levelCompleted = 8;
//		bonus = 200;
//		if(gameOver == true) {
//			int finalScore = score + (levelCompleted * bonus);
//			System.out.println(finalScore);
//		}
		calculateScore(true, 10000, 8, 200 );
	}
	
	// To avoid duplication and other cons, to clean up extra code, we can use method
	public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
		if(gameOver == true) {
			int finalScore = score + (levelCompleted * bonus);
			finalScore += 1000;
			System.out.println(finalScore);
		}
	}
}
