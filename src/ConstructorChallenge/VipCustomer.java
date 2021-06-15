package ConstructorChallenge;

public class VipCustomer {

	private String name;
	private double creditlimit;
	private String email;

	public VipCustomer() {
		this("Default", 50, "default@gmx.de");
		System.out.println("Emptly with default val constructor is called");
	}

	public VipCustomer(String name, int creditlimit) {
		this(name, creditlimit, "default2@gmx.de");
		System.out.println("VipCustomer with 1 default val constructor is called");
	}

	public VipCustomer(String name, int creditlimit, String email) {
		this.name = name;
		this.creditlimit = creditlimit;
		this.email = email;
		System.out.println("VipCustomer constructor with all field is called");
	}

	public String getName() {
		return this.name;
	}

	public double getCreditlimit() {
		return this.creditlimit;
	}

	public String getEmail() {
		return this.email;
	}
}
