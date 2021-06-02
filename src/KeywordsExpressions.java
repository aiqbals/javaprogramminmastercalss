

public class KeywordsExpressions {
	public static void main(String[] args) {
		//Java reserved Keywords (50+) that we can not use as variable e.g. int int = 5;
		double km = (100 * 1.609344); 
		// 'km = (100 * 1.609344) is an expression'
		int highScore = 50; // 'highScore = 50' expression
		if(highScore == 50) { // 'highScore== 50' expression
			System.out.println("Expression"); //Expression
		}
		
		// Statement, Whitespace and Indentation
		int myVar = 40;
		myVar++;
		myVar--;
		System.out.println("Statement");
		// All are statement - entire line. 
		// Dont put statement in the same line e.g., int a = myVar; myVar++; 
		
		System.out.println("This is        Whitespace");
		// White space the sapce in between you expression and operators and operands;
		// Java delete whitespace internally
		
		// Indentation is indenting a code to make it more readable
	}
}
