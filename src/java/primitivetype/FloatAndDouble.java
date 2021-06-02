package java.primitivetype;

public class FloatAndDouble {
	public static void main(String[] args) {
		// Float - single precision - occupies 32bit or 4 byte
		float myMinFloatVal = Float.MIN_VALUE;
		float myMaxFloatVal = Float.MAX_VALUE;
		System.out.println(myMinFloatVal);
		System.out.println(myMaxFloatVal);
		
		// Float - single precision - occupies 64bit or 8 byte
		double myMinDoubleVal = Double.MIN_VALUE;
		double myMaxDoubleVal = Double.MAX_VALUE;
		System.out.println(myMinDoubleVal);
		System.out.println(myMaxDoubleVal);
		
		int myIntVal = 5;
		float myFloatVal = (float) 5.25; 
		// It consider the floating as double, so type conversion. Not recommended to use float
		double myDoubleval = 5d;
		
		int myIntVal2 = 5/3;
		float myFloatVal2 = 5/3f; 
		double myDoubleval2 = 5/3d;
		System.out.println(myIntVal2);
		System.out.println(myFloatVal2);
		System.out.println(myDoubleval2);
		// check it by dividing 2. 
		//After dividing by 3. Double is lot more precise and has more precision than float
		// Double is recommended, is faster thn float to process by computer.
		double pi = 3.1415927d;
		double anotherNum = 3_000_000.4_57_890d;
		System.out.println(pi);
		System.out.println(anotherNum);
		
		// Float and Double are great but not great to use where precise calculations are required.
		// To be more precise, BigDecimal is used. E.g., currency calculations
	}
}
