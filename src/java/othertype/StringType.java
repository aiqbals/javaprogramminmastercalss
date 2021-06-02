package java.othertype;


public class StringType {
	public static void main(String[] args) {
		String myString = "This is a String";
		System.out.println(myString);
		myString = myString + ", and this is more.";
		System.out.println(myString);
		myString = myString + " \u00A9 2019"; // unicode can be used in string
		System.out.println(myString);
		String numStr = "250.55";
		numStr = numStr + "49.95";
		System.out.println(numStr);
		String lastStr = "10";
		int myInt = 50;
		lastStr = lastStr + myInt;
		System.out.println(lastStr); //Java covert int into str
		double doubleNum = 120.47d;
		lastStr = lastStr + doubleNum;
		System.out.println(lastStr);
	}
}
// Non-primitive data type. It is actually a Class
// String in Java are Immutable, it just create new string (old discarded) after adding or deleting
// StringBuffer is used to modify string instead of above way for performance reason
