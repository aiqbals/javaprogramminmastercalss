package java.primitivetype;

public class IntByteShortLongChellagne {
	public static void main(String[] args) {
		byte byteVal = 10;
		short shortVal = 20;
		int intVal = 50;
		
		long longTotal = 50000L + 10L * (byteVal + shortVal + intVal);
		System.out.println(longTotal);
		
		short shortTotal = (short) (1000 + 10 * 
				(byteVal + shortVal + intVal));
	}
}
