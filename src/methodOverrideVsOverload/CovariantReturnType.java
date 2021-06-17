package methodOverrideVsOverload;

public class CovariantReturnType {
	
	class Burger {
		// fields, methods
	}
	class HealthyBurger extends Burger {
		// fields, methods
	}
	
	class BurgerFactory {
		
		public Burger createBurger() {
			return new Burger();
		}
	}
	
	class HealthyBurgerFactory extends BurgerFactory {
		public HealthyBurger createBurger() {
			return new HealthyBurger();
		}
	}
}
