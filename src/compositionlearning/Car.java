package compositionlearning;

public class Car extends Vehicle {
	// Since Car extends Vehicle, it is a IS-A relationship with Vehicle (a car is-a vehicle)
	// Composition is a Has-a relationship e.g., Computer has monitor, motherboard Since these are not computer alone
	
	private int doors;
	private int engineCapacity;
	
	public Car(String name, int doors, int engineCapacity) {
		super(name);
		this.doors = doors;
		this.engineCapacity = engineCapacity;
		
	}	
}
