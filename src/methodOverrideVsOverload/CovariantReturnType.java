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
		// method creates Burger instance
	}
	
	class HealthyBurgerFactory extends BurgerFactory {
		public HealthyBurger createBurger() {
			return new HealthyBurger();
		}
		// method creates HealthyBurger instance
	}
}
