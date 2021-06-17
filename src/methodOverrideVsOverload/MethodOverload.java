package methodOverrideVsOverload;

public class MethodOverload {
	
	// Same name method with diff type or no. of parameters
	
	public void bark() {
		System.out.println("woof");
	}
	
	public void bark(int num) {
		for(int i=0; i < num; i++) {
			System.out.println("woof");
		}
	}
}
