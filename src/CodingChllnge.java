
public class CodingChllnge {
	
	public static void main(String[] srgs) {
		checkNum(1);
		checkNum(-1);
		checkNum(0);
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
	
	// Ch-1
}
