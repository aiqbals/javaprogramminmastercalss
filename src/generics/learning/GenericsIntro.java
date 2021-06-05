package generics.learning;
import java.util.ArrayList;

// ************* ArrayList with Generics **************

public class GenericsIntro {
	public static void main(String[] args) {
		ArrayList<Integer> items = new ArrayList<>();
		//ArrayList with parameterized type (generics)
		items.add(1);
		items.add(2);
		items.add(3);
		//items.add("Test"); // Now it gives warning in compile time
		items.add(4);
		items.add(5);
		items.add(6);	
		
		printDoubled(items);
	}
	
	public static void printDoubled(ArrayList<Integer> n) {
		for(int i: n) { 
		// no use of object type as we know the type of data
			System.out.println(i * 2);
			// adding type or typecas not needed anymore
		}
	}
}


//************* ArrayList without Generics **************

//public class Generics1 {
//	public static void main(String[] args) {
//		//ArrayList items = new ArrayList(); 
//		items.add(1);
//		items.add(2);
//		items.add(3);
//		//items.add("Test"); 
//		// is valid but in run time, we get exception since we r printing Int type
//		// that is why, we need to add type to the ArrayList which is parameterized type (generics) so it detects the error in compile time
//		items.add(4);
//		items.add(5);
//		items.add(6);
//		//System.out.println(items);
//		
//		printDoubled(items);
//	}
//	
//	//public static void printDoubled(ArrayList n) {
//	public static void printDoubled(ArrayList<Integer> n) {
//		for(Object i: n) { 
//		// Object type is used since there is no specific types and Obj is the parents of any type
//			System.out.println((Integer)i * 2); 
//			// Obj cant be multiplied, so, we had to typecast to tell java what type of Obj in that ArrayList 
//			// But technically, ArrayList can contain anytype of data as we did not define the type
//		}
//	}
//}
