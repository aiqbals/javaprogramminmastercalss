package oopmasterchallenge;

public class DeluxHamburger extends Hamburger {
	
	public DeluxHamburger() {
		super("Delux", "Deer & Beef", 5.5, "Brown");
		super.addHamburgerAddtion1("Chips", 2.7);
		super.addHamburgerAddtion2("Drinks", 2.5);
	}

	@Override
	public void addHamburgerAddtion1(String name, double price) {
		System.out.println("Can not add additional items to a deluxe burgerd");
	}

	@Override
	public void addHamburgerAddtion2(String name, double price) {
		System.out.println("Can not add additional items to a deluxe burgerd");
	}

	@Override
	public void addHamburgerAddtion3(String name, double price) {
		System.out.println("Can not add additional items to a deluxe burgerd");
	}

	@Override
	public void addHamburgerAddtion4(String name, double price) {
		System.out.println("Can not add additional items to a deluxe burger");
	}
	
	
}
