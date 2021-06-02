package java.primitivetype;

public class IntByteShortLong {
	public static void main(String[] args) {
		int myValue = 10000;
		int myMinValue = Integer.MIN_VALUE;
		int myMaxValue = Integer.MAX_VALUE;
		
		System.out.println("Integer Minimum Value = " + myMinValue);
		System.out.println("Integer Maximum Value = " + myMaxValue);
		System.out.println("Crossing Max Value Result = " + (myMaxValue + 1)); // Overflow
		System.out.println("Crossing Min Value Result = " + (myMinValue - 1)); // Underflow
		
		//int myMaxIntTest = 2147483648;
		// Java has wrapper class to find max min e.g., for int, Integer
		
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Byte Minimum Value = " + myMinByteValue);
		System.out.println("Byte Maximum Value = " + myMaxByteValue);
		// a Byte occupies 8-bit.
		
		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		System.out.println("Short Minimum Value = " + myMinShortValue);
		System.out.println("Short Maximum Value = " + myMaxShortValue);
		// a Byte occupies 16-bit.
		
		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		System.out.println("Long Minimum Value = " + myMinLongValue);
		System.out.println("Long Maximum Value = " + myMaxLongValue);
		// a Byte occupies 32-bit.
		
		// Casting
		int myTotall = (myMinValue / 2);
		byte myNewByteVal = (byte)(myMinByteValue / 2);
		Short myNewShortValue = (short)(myMinShortValue / 2);
		// Advice: Alwasys use int unless there is a good reason
		
	}
}
