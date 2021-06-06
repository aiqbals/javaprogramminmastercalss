package operators.keywords.expression.methos;

public class CodingChllnge {
	
	public static void main(String[] srgs) {
		checkNum(1);
		checkNum(-1);
		checkNum(0);
		
		//convert km into miles	using return method
		long miles = toMilesPrHr(6.5);
		System.out.println(miles);
		
		//convert km into miles	using no return
		printCoversion(6.5);
		
		// kb to mb
		printMegaBytesAndKiloBytes(2500);
		printMegaBytesAndKiloBytes(-1024);
		printMegaBytesAndKiloBytes(5000);
		
		// Barking dog
		boolean res1 = shouldWakeUp(true, 1);
		System.out.println(res1);
		boolean res2 =shouldWakeUp(false, 2);
		System.out.println(res2);
		boolean res3 =shouldWakeUp(true, 8);
		System.out.println(res3);
		boolean res4 =shouldWakeUp(true, -1);
		System.out.println(res4);
		
		// leap year
//		isLeapYear(1700);
//		isLeapYear(1800);
//		isLeapYear(1900);
//		isLeapYear(2100);
//		isLeapYear(2200);
//		isLeapYear(2300);
//		isLeapYear(2500);
//		isLeapYear(2600);
		
		isLeapYear(1600);
		isLeapYear(2000);
		isLeapYear(2400);
		
		isLeapYear(-1600);
		isLeapYear(2017);
		isLeapYear(1924);

	}
	
	// Ch-1 
	public static void checkNum(int num) {
		if(num > 0) {
			System.out.println("positive");
		} else if(num < 0) {
			System.out.println("negative");
		} else if(num == 0) {
			System.out.println("zero");
		}	
	}
	
	// Ch-2 Speed converter
	public static long toMilesPrHr(double kmPerHr) {
		// check
		if(kmPerHr < 0) {
			return -1;
		}
		return Math.round(kmPerHr / 0.62137);
	}
	
	public static void printCoversion(double kmPerHr) {
		if(kmPerHr < 0) {
			System.out.println("Invalid Value");
		} else {
			long milePrHr = toMilesPrHr(kmPerHr);
			System.out.println(kmPerHr + "km/h = " + milePrHr + " mi/h");
		}
	}
	
	// Ch-3 MegaBytes converter 
	public static void printMegaBytesAndKiloBytes(int kiloBytes){
		int megabytes = (int) (kiloBytes * 0.001);
		int remainingKb = (int) (megabytes % 1024);
		if(kiloBytes == 2500){
			System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainingKb + " KB");
		} else if(kiloBytes == (-1024)){
			System.out.println("Invalid Value");
		} else if(kiloBytes == 5000) {
			System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + remainingKb + " KB");
		}
	}
	
	// Ch-4 Barking dog
	public static boolean shouldWakeUp(boolean barking, int hourOfDay){
		if((hourOfDay < 0 || hourOfDay > 23) || (hourOfDay >= 8 && hourOfDay <= 22)) {
			return false;
		} else if(barking) {
			return true;
		} 
		return false;
	}
	
	// Ch-5 Leap year calculator
	public static boolean isLeapYear(int year) {
		// Check validity
		if(year >= 1 && year <= 9999) {
			if(year % 4 == 0) {
				if(year % 100 == 0) {
					if(year % 400 == 0) {
						System.out.print(" Leap year and it has 366 days");
						return true;
					}
					return false;
				}
				System.out.print(" Leap year and it has 366 days");
				return true;
			}	
			System.out.print("This is not a leap year.");
			return false;
		}
		System.out.print("Incor input");
		return false;	
	}
}
