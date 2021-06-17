package staticVsInstance;

public class Calculator {
	private int a, b;
	private static String name; // static variable is shared between instances 
	private String name2;
	
	
//	public Calculator() {
//	}
//	public Calculator(String name) {
//		Calculator.name = name; // direct access to static variable
//	}
	
	public Calculator(String name2) {
		this.name2 = name2; // Using instance vaiable
	}

	public void printName() {
		System.out.println(name);
	}
	public void printName2() {
		System.out.println(name2);
	}
	
	// When to create Static method - Is a independent method, when no use of Instance variables, and methods
	// If there are use of instance methods or variables, it should probably be an instance method
	public static void printSum(int a, int b) {
		System.out.println(a+b);
	}
	
	// Instance method can access or use instance methods and variables
	// Instance method can also access static methods and static variables directly 
	
	public void printSubstr(int n1, int n2) {
		this.a = n1;
		this.b = n2;
		System.out.println(a-b);
	}	
}
