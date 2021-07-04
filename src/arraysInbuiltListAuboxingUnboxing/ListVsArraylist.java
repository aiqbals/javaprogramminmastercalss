package arraysInbuiltListAuboxingUnboxing;

import java.util.ArrayList;
import java.util.Scanner;

//ararylist means resizable array or having no size limitaiton unlike usual array.
// below is the example of why we need arraylist
//public class ListVsArraylist {		
//	    private static Scanner s = new Scanner(System.in);
//	    private static int[] baseData = new int[10];
//
//	    public static void main(String[] args) {
//	        System.out.println("Enter 10 integers:");
//	        getInput();
//	        printArray(baseData);
//	        resizeArray();
//	        System.out.println("Enter 12 integers:");
//	        getInput();
////	        baseData[10] = 67;
////	        baseData[11] = 34;
//	        printArray(baseData);
//
//	    }
//
//	    private static void getInput()
//	    {
//	        for(int i = 0; i < baseData.length; i++)
//	            baseData[i] = s.nextInt();
//	    }
//
//	    private static void printArray(int[] arr)
//	    {
//	        for(int i = 0; i < arr.length; i++)
//	            System.out.print(arr[i] + " ");
//	        System.out.println();
//	    }
//
//	    private static void resizeArray()
//	    {
//	        int[] original = baseData;
//
//	        baseData = new int[12];
//	        for (int i = 0; i < original.length; i++)
//	            baseData[i] = original[i];
//	    }
//}


// Using arraylist
public class ListVsArraylist {		
	private static Scanner scanner = new Scanner(System.in);
	//private int[] number = new int[50];
	private ArrayList<String> groceryList = new ArrayList<String>();
	// arraylist can hold object as well, so we need to define the type of value it stores
	// arraylist is a class, means it has constructor, so the bracket ()
	
    public static void main(String[] args) {
    	ListVsArraylist obj = new ListVsArraylist();
    	
    	boolean quit = false;
    	int choice = 0;
    	printInstruction();
    	while(!quit) {
    		System.out.println("Enger your choice: ");
    		choice = scanner.nextInt();
    		scanner.nextLine();
    		
    		switch(choice) {
    			case 0:
    				printInstruction();
    				break;
    			case 1:
    				obj.printGrocerylist();
    				break;
    			case 2:
    				addItem();
    				break;
    			case 3:
    				modifyItem();
    				break;
    			case 4:
    				removeItem();
    				break;
    			case 5:
    				searchItem();
    				break;
    			case 6:
    				quit = true;
    				break;
    		}
    	}
   
    	
    	obj.addGroceryItem("Broculi");
    	obj.addGroceryItem("Cola");
    	obj.addGroceryItem("Rice");
    	
    	obj.printGrocerylist();
    	
    	obj.modifyGrocery(2, "Bread");
    	obj.printGrocerylist();
    	
    	obj.removeItem(1);
    	obj.printGrocerylist();
    	
    	obj.findItem("Kaki");
    }
    
	public void addGroceryItem(String item) {
		//number[5] = 4;
		groceryList.add(item);
	}
	public void printGrocerylist() {
		System.out.println("You have " + groceryList.size() + " items in your grocery list");
		for(int i=0; i<groceryList.size(); i++) {
			System.out.println((i+1) + ". " + groceryList.get(i));
		}
	}
	
	public void modifyGrocery(int position, String newItem) {
		groceryList.set(position, newItem);
		System.out.println("Grocery item " + (position) + " has been modified");
	}
	
	public void removeItem(int position) {
		groceryList.remove(position);
		System.out.println("Grocery item " + (position) + " has been removed");
	}
	
	public String findItem(String searchItem) {
		//boolean exists = groceryList.contains(searchItem);
		int position = groceryList.indexOf(searchItem);
		if(position >= 0) {
			return groceryList.get(position);
		}
		//System.out.println();
		return null;
	}
	
	public static void printInstruction() {
		System.out.println("\nPress ");
		System.out.println("\t 0 - To print choice option.");
		System.out.println("\t 1 - To print the list of grocery items.");
		System.out.println("\t 2 - To add an item to the list.");
		System.out.println("\t 3 - To modify an item in the list.");
		System.out.println("\t 4 - To remove an item from the list.");
		System.out.println("\t 5 - To search for an item in the list.");
		System.out.println("\t 6 - To quite the applicaiton.");
	}
}
