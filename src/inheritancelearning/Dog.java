package inheritancelearning;

public class Dog extends Animal{
	
	// extra behaviour
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;

	//public Dog(int brain, int body, int size, int weight, String name, int eyes, int tail, int teeth, String coat) {
	public Dog(int size, int weight, String name, int eyes, int legs, int tail, int teeth, String coat) {
		//super(brain, body, size, weight, name);
		super(1, 1, size, weight, name);
		// we just defined that all dog has brain and body by 1 and we are not adding these parameters
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}
	// this first go to Animal constructor of extended class (super)
	
	private void chew() {
		System.out.println("Dog.chew() called");
	}

	@Override
	public void eat() {
		System.out.println("Dog.eat() called");
		chew();
		super.eat();
	}
	
	public void walk() {
		System.out.println("Dog.walk() called");
		//super.move();
		move(5); // better way
	}
	
	public void run() {
		move(10);
	}
}
