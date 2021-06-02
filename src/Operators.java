

public class Operators {
	public static void main(String[] args) {
		int res = 1 + 2;
		System.out.println(res);
		int prevRes = res;
		System.out.println(prevRes);
		res = res - 1;
		System.out.println(res);
		System.out.println(prevRes); // res r independent e.g., prevRes still the same
		
		res = res * 10;
		System.out.println(res);
		
		res = res / 5;
		System.out.println(res);
		
		res = res % 3; // 1
		System.out.println(res);
		
		res++; // 1 + 1 = 2
		System.out.println(res);
		
		res--; // 2 - 1 = 1
		System.out.println(res);
		
		res +=2; // 1 + 2 = 3
		System.out.println(res);
		
		res /=3; // 3 / 3 = 1
		System.out.println(res);
		
		// if-than statement
		boolean isAlien = false;
		if(isAlien == false)
			System.out.println("It is not an Alien");
			System.out.println("It is an Alien");
			// if no codeblock, only one line of statement is executed for that particular if
			// code block allows more than one statement
			
		// logical operators
		int topScore = 100;
		if(topScore != 100) {
			System.out.println("Its not a top score");
		}
		if((topScore <= 100) || (topScore == 100)) {
			System.out.println("Its not a top score");
		}
		
		// Assignment vs equal operators // = vs ==
		boolean isCar = false;
		if(isCar == true) {
			System.out.println("Its assgn operator");
		} 
		// = also works since isCar is a boolean var and value can be assigned true here
		// we can we only isCar instead of isCar == True and for false !isCar
		
		// Ternary operator
		isCar = true;
		boolean wasCar = isCar ? true : false;
		if(wasCar) {
			System.out.println("wasCar is True");
		}
		
		// All operators java
		// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
		
		// Java precedence - parenthesis gets higher prece, thn multi, divid, moduls and thn add substract
		// http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html		
	}
}
