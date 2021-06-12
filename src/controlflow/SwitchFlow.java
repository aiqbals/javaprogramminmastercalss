package controlflow;

public class SwitchFlow {
	public static void main(String[] args) {
		
		String month = "July";
		switch(month.toLowerCase()) {
		// below, shortcut way of multiple statement
		case "Jan" : case "June" : case "July" :
			System.out.println("This is month " + month);
			break;
		default: 
			System.out.println("This is Unkown month ");
			break;
		}
	}
}
