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
		
		int count = 0;
		for(int i=10; i<50; i++) {
			
			boolean prime = isPrime(i);
			if(prime == true) {
				count++;
				System.out.println(i + " is prime no.");
			}
			if(count == 10) {
				break;
			}
		}
		
		//forEach
		int ar[] = {2,3,4,5,6};
		for(int el: ar) {
			System.out.println(el);
		}
		
		// 2D array
		int ar2d[][] = {{2,3,4,5,6}, {7,8,9}};
		for(int i = 0; i <= ar2d.length; i++) {
			//System.out.println(ar2d[i]);
			for(int j = 0; j <= 2; j++) {
				System.out.println(ar2d[i][j]);
			}
		}
		
	}
	
	public static boolean isPrime(int n) {
		if(n == 1) {
			System.out.println("Invalid input ");
			return false;
		}
		//for(int i=2; i<=n/2; i++) {
		for(int i=2; i <= (long) Math.sqrt(n); i++) {
		// it is faster thn previous optimization
			System.out.println("Looping " + i);
			if(n % i == 0) {
				//System.out.println("False");
				return false;
			}
		}
		//System.out.println("True");
		return true;
	}
	
	public static double calculateInterest(double amount, double interestRt) {
		return(amount * (interestRt/100));
	}
}
