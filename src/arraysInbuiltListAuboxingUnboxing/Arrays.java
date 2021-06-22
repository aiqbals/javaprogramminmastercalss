package arraysInbuiltListAuboxingUnboxing;

import java.util.Scanner;

public class Arrays {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
	
		int[] myVar = {12,22,14,44,33,5};
		int[] myIntArr;
		myIntArr = new int[5];
		//myIntArr[0] = 50;
		//myIntArr[1] = 50;
		
		double[] myDoubleArr = new double[10];
		myDoubleArr[5] = 50.5;
		//System.out.println(myDoubleArr[5]);
		
		for(int i=0; i<5; i++) {
			myIntArr[i] = i;
		}
		printArr(myIntArr);
		
		int[] myInt = getIntegers(5); 
		boolean val= true;
		String userVal;
		while(val) {
			for(int i=0; i<myInt.length; i++) {
				System.out.println(myInt[i]);
			}
			System.out.println("Wanna repeat? y/n ");
			userVal = scanner.nextLine();
			if(userVal.toLowerCase().equals("n")) {
				val = false;
			}
		}
		
	}
	
	public static void printArr(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			//System.out.println(arr[i]);
		}
	}
	
	public static int[] getIntegers(int num) {
			System.out.println("Enter " + num + " integer values.\r");
			int[] values = new int[num];
			for(int i =0; i<values.length; i++) {
				values[i] = scanner.nextInt();
			}
			
			return values;
	}

}
