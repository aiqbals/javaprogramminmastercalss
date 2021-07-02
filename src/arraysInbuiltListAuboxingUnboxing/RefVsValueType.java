package arraysInbuiltListAuboxingUnboxing;

public class RefVsValueType {

	public static void main(String[] args) {
		int myIntVal = 10;
		int anotherMyIntVal = myIntVal; // myIntVal is copied to anotherMyIntVal in memory
		
		System.out.println(myIntVal);
		System.out.println(anotherMyIntVal);
		
		anotherMyIntVal++;
		
		System.out.println(myIntVal);
		System.out.println(anotherMyIntVal);
		
		int[] myIntArr = new int[5];
		// myIntArr holds a ref. or address of a an array in memory
		// one way to know its a ref type, new operator that create new obj in memory
		int[] anotherIntArr = myIntArr;
		// anotherIntArr also hold the same ref. or address
		
		System.out.println(Arrays.toString(myIntArr)); // [0,0,0,0,0]
		// toString - join multiple string or object using coma as a separator
		System.out.println(Arrays.toString(anotherIntArr)); // [0,0,0,0,0]
		
		anotherIntArr[0] = 1; // both var value will be changed since it holds the same ref.
		System.out.println(Arrays.toString(myIntArr)); // [1,0,0,0,0]
		System.out.println(Arrays.toString(anotherIntArr)); // [1,0,0,0,0]
	}

}
