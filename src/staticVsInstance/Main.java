package staticVsInstance;

public class Main {

	public static void main(String[] args) {
		Calculator.printSum(2, 3);
		// Static method can be called directly without creating Calculator instance
		Main.printHello(); 
		// Static method are called this way or only method name
		
//		Calculator cal = new Calculator();
//		cal.printSubstr(5, 2); // Calculator instance need to be created to access printSubtr
		
//		Calculator whatName = new Calculator("FirstNAme");
//		Calculator whatName2 = new Calculator("LastName");
//		whatName.printName(); //LastName
//		whatName2.printName(); //LastName
		// Both print Last name since Static variable is shared with two instance of Calculator
		// Hence, variable name will be updated with second instance whatName2
		
		// Incase of instance vaiable
		Calculator whatName = new Calculator("FirstNAme");
		Calculator whatName2 = new Calculator("LastName");
		whatName.printName2(); //FirstName
		whatName2.printName2(); //LastName
	}
	
	public static void printHello() {
		System.out.println("Hello");
	}

}
