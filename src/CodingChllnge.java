
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
	
	// MegaBytes converter 
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
	
	// Barking dog
	public static boolean shouldWakeUp(boolean barking, int hourOfDay){
		
		return false;
	}
}
