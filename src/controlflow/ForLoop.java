package controlflow;

public class ForLoop {
	
	public static void main(String[] args) {
//		System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
//		System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
//		System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
//		System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));
		
		// forward loop
		for(int i=2; i<9; i++) {
			System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
			//to show 2dec point and avoid precision e.g, 7%, double interest 700.0000000000001.
		}
		
		// backward loop
		for(int i=8; i>1; i--) {
			System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
			//to show 2dec point and avoid precision e.g, 7%, double interest 700.0000000000001.
		}
	}
	
	public static double calculateInterest(double amount, double interestRt) {
		return(amount * (interestRt/100));
	}
}
