package oopmasterchallenge;

public class Hamburger {
	private String BreadrollType;
	private String meat;
	private String name;
	private double price;

	private String additon1Name;
	private double addition1Price;
	
	private String additon2Name;
	private double addition2Price;
	
	private String additon3Name;
	private double addition3Price;
	
	private String additon4Name;
	private double addition4Price;
	
	public Hamburger(String name, String meat, double basePrice, String BreadrollType) {
		super();
		this.BreadrollType = BreadrollType;
		this.meat = meat;
		this.name = name;
		this.price = basePrice;
	}
	
	public void addHamburgerAddtion1(String name, double price) {
		this.additon1Name = name;
		this.addition1Price = price; 
	}
	public void addHamburgerAddtion2(String name, double price) {
		this.additon2Name = name;
		this.addition2Price = price; 
	}
	public void addHamburgerAddtion3(String name, double price) {
		this.additon3Name = name;
		this.addition3Price = price; 
	}
	public void addHamburgerAddtion4(String name, double price) {
		this.additon4Name = name;
		this.addition4Price = price; 
	}
	
	public double totalPrice() {
		double hamburgerPrice = this.price;
		System.out.println(this.name + " hamburger " + " on a " + this.BreadrollType 
				+ " roll with " + this.meat + ", price is " + this.price);
		
		if(this.additon1Name != null) {
			hamburgerPrice += this.addition1Price; 
			System.out.println("Added " + this.additon1Name +" for an extra " + this.addition1Price);
		}
		if(this.additon2Name != null) {
			hamburgerPrice += this.addition2Price; 
			System.out.println("Added " + this.additon2Name +" for an extra " + this.addition2Price);
		}
		if(this.additon3Name != null) {
			hamburgerPrice += this.addition3Price; 
			System.out.println("Added " + this.additon3Name +" for an extra " + this.addition3Price);
		}
		if(this.additon4Name != null) {
			hamburgerPrice += this.addition4Price; 
			System.out.println("Added " + this.additon4Name +" for an extra " + this.addition4Price);
		}
		return hamburgerPrice;
	}
	
}
