package methodOverrideVsOverload;

public class Main {

	public static void main(String[] args) {
		
		MethodOverload load = new MethodOverload();
		load.bark();
		
		MethodOverride ride = new MethodOverride();
		ride.bark();

	}

}
