package inheritancelearning;

public class Main {

	public static void main(String[] args) {
		
		Animal animal = new Animal(1, 1, 5, 5, "Animal");
		
		Dog dog = new Dog(8, 20, "Tom", 2, 4, 1, 20, "long silky");
		dog.eat(); 
		System.out.println("--------------------------");
		
		dog.walk();
		System.out.println("--------------------------");
		
		dog.run();
	}

}
