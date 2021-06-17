package staticVsInstance;

public class Main {

	public static void main(String[] args) {
		Calculator.printSum(2, 3);
		// Static method can be called directly without creating Calculator instance
		Main.printHello(); 
		// Static method are called this way or only method name
		
		Calculator cal = new Calculator();
		cal.printSubstr(5, 2); // Calculator instance need to be created to access printSubtr
	}
	
	public static void printHello() {
		System.out.println("Hello");
	}

}
