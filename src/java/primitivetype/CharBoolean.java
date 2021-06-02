package java.primitivetype;

public class CharBoolean {
	public static void main(String[] args) {
		char myChar = 'D';
		char myUnicodeChar = '\u0044';
		char myCopyrightChar = '\u00A9';
		System.out.println(myChar); // '\' tell compiler that it is unicode char
		System.out.println(myUnicodeChar);
		System.out.println(myCopyrightChar);
		// Char is diff to string, it store single character
		
		boolean myBoolTrue = true;
		boolean myBoolFalse = false;
		// true or false, yes or no, 0 or 1
		boolean isCustomerOverEighteen = true;
	}
}
