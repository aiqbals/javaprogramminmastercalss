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
		super.move(5); // it calls move method of Animal class even if we override the move method here
		//move(5); // better way and now the overriden move method is called 
	}
	
	public void run() {
		System.out.println("Dog.run() called");
		move(10); 
		// better way and now the overriden move method is called 
		// if there is no overridden method move for dog, it calls Animal move method default
	}
	
	public void moveLegs(int speed) {
		System.out.println("Dog.moveLegs() called");
	}
	
	@Override
	public void move(int speed) {
		System.out.println("Dog.move() called");
		moveLegs(speed);
		super.move(speed);
	}
}
