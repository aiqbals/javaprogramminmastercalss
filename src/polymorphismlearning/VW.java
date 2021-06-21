package polymorphismlearning;

class VW extends Car {

	public VW(int cylinders, String name) {
		super(cylinders, name);
	}

	@Override
	public String startEngine() {
		return "VW -> starting engine";
	}

	@Override
	public String accelerate() {
		return "VW -> accelerating";
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return "VW -> braking";
	}
	
}
