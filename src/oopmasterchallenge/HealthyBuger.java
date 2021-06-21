package oopmasterchallenge;

public class HealthyBuger extends Hamburger{
	private String healtyEtra1Name;
	private double healtyExtra1Price;
	
	private String healtyEtra2Name;
	private double healtyExtra2Price;
	
	public HealthyBuger(String meat, double basePrice) {
		super("Healthy", meat, basePrice, "Brown");
	}

	public void addHealthyAddtion1(String name, double price) {
		this.healtyEtra1Name = name;
		this.healtyExtra1Price = price; 
	}
	public void addHealthyAddtion2(String name, double price) {
		this.healtyEtra2Name = name;
		this.healtyExtra2Price = price; 
	}

	@Override
	public double totalPrice() {
		double hamburgerPrice = super.totalPrice();

		if(this.healtyEtra1Name != null) {
			hamburgerPrice += this.healtyExtra1Price; 
			System.out.println("Added " + this.healtyEtra1Name +" for an extra " + this.healtyExtra1Price);
		}
		if(this.healtyEtra2Name != null) {
			hamburgerPrice += this.healtyExtra2Price; 
			System.out.println("Added " + this.healtyEtra2Name +" for an extra " + this.healtyExtra2Price);
		}
		return hamburgerPrice;
	}		
}
