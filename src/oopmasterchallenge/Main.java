package oopmasterchallenge;

public class Main {

	public static void main(String[] args) {
		
		Hamburger hamburger = new Hamburger("Basic", "Chicken", 3.5, "white");
		double price = hamburger.totalPrice();
		System.out.println("Total price is: " + price);
		System.out.println("-------Hamburger-------");
		
		hamburger.addHamburgerAddtion1("tomato", .75);
		hamburger.addHamburgerAddtion2("Lettuce", .55);
		hamburger.addHamburgerAddtion3("Cheese", .55);
		System.out.println("Total price is: " + hamburger.totalPrice());
		
		System.out.println("-------Healthy-------");
		HealthyBuger healthyburger = new HealthyBuger("Beef", 5);
		System.out.println("Total healthy burger price is: " + healthyburger.totalPrice());
		healthyburger.addHamburgerAddtion1("Egg", 1.5);
		System.out.println("Total healthy burger price is: " + healthyburger.totalPrice());
		healthyburger.addHealthyAddtion1("Salat", 1.3);
		System.out.println("Total healthy burger price is: " + healthyburger.totalPrice());
		
		System.out.println("-------Delux-------");
		DeluxHamburger delux = new DeluxHamburger();
		System.out.println("Total delux burger price is: " + delux.totalPrice());
		delux.addHamburgerAddtion3("Should prevent adding more addition thn waht defined in constructor", 0);
		//how to preven adding more - by overridding the adding methods
	}
}
