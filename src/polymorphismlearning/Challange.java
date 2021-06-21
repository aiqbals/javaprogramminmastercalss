package polymorphismlearning;

class Car {
	private int cylinders;
	private int wheels;
	private boolean engine;
	private String name;
	
	public Car(int cylinders, String name) {
		this.cylinders = cylinders;
		this.name = name;
		this.engine = true;
		this.wheels = 4;
	}

	public int getCylinders() {
		return cylinders;
	}

	public String getName() {
		return name;
	}
	
	public String startEngine() {
		return "Car -> starting engine";
	}
	
	public String accelerate() {
		return "Car -> accelerating";
	}
	
	public String brake() {
		return "Car -> braking";
	}

}

class Audi extends Car {
	
}
class BMW extends Car {
	
}
class Marcedes extends Car {
	
}


public class Challange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
