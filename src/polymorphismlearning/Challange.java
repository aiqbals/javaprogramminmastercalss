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

	public Audi(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public String startEngine() {
		return "Audi -> starting engine";
	}

	@Override
	public String accelerate() {
		return "Audi -> accelerating";
	}

	@Override
	public String brake() {
		return "Audi -> braking";
	}
	
	
}

class BMW extends Car {

	public BMW(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public String startEngine() {
		return "BMW -> starting engine";
	}

	@Override
	public String accelerate() {
		return "BMW -> accelerating";
	}

	@Override
	public String brake() {
		return "BMW -> braking";
	}
	
}

//class Marcedes extends Car {
//
//	public Marcedes(int cylinders, String name) {
//		super(cylinders, name);
//	}
//
//	@Override
//	public String startEngine() {
//		return "Marcedes -> starting engine";
//	}
//
//	@Override
//	public String accelerate() {
//		return "Marcedes -> accelerating";
//	}
//
//	@Override
//	public String brake() {
//		// TODO Auto-generated method stub
//		return "Marcedes -> braking";
//	}
//	
//}


public class Challange {

	public static void main(String[] args) {
		
		Car car = new Car(1, "Car");
		System.out.println("------" + car.getName() + "------");
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());
		
		Audi audi = new Audi(1, "Car");
		System.out.println("------" + audi.getName() + "------");
		System.out.println(audi.startEngine());
		System.out.println(audi.accelerate());
		System.out.println(audi.brake());
		System.out.println(audi.brake());
		
		BMW bmw = new BMW(1, "Car");
		System.out.println("------" + bmw.getName() + "------");
		System.out.println(bmw.startEngine());
		System.out.println(bmw.accelerate());
		System.out.println(bmw.brake());
		
		//Marcedes marcedes = new Marcedes(1, "Car");
		Car marcedes = new Car(6, "Marcedes") {
			@Override
			public String startEngine() {
				return "Marcedes -> starting engine";
			}
		
			@Override
			public String accelerate() {
				return "Marcedes -> accelerating";
			}
		
			@Override
			public String brake() {
				// TODO Auto-generated method stub
				return "Marcedes -> braking";
			}
		};
		// Inline class refactor
		System.out.println("------" + marcedes.getName() + "------");
		System.out.println(marcedes.startEngine());
		System.out.println(marcedes.accelerate());
		System.out.println(marcedes.brake());
		
	}

}
