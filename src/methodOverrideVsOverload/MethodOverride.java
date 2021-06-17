package methodOverrideVsOverload;

public class MethodOverride extends MethodOverload{
	
	// Same signature (same name and parameter)
	@Override
	public void bark() {
		System.out.println("wo wo woo");
	}
}
