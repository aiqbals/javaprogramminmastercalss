package ConstructorChallenge;

public class Main {
	public static void main(String[] args) {
		
		VipCustomer cus1 = new VipCustomer();
		VipCustomer cus2 = new VipCustomer("Customer2", 100);
		VipCustomer cus3 = new VipCustomer("Customer3", 200, "cus3@gmx.de");
		
		System.out.println(cus1.getEmail());
		System.out.println(cus2.getEmail());
		System.out.println(cus3.getEmail());
	}
}
