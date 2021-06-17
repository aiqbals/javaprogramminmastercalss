package staticVsInstance;

public class Calculator {
	
	// Static method - independent method that do not use Instance variables, and methods
	public static void printSum(int a, int b) {
		System.out.println(a+b);
	}
	
	// Instance method can access or use instance methods and variables
	// Instance method can also access static methods and static variables directly 
	
	public void printSubstr(int a, int b) {
		System.out.println(a-b);
	}
}
