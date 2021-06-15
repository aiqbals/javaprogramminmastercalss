package constructorlearning;

public class Main {

	public static void main(String[] args) {
		Bankaccount person1 = new Bankaccount("01", 0.00, "Person1", "pr1@gmx.com", "012");
		Bankaccount person2 = new Bankaccount("02", 0.00, "Person2", "pr2@gmx.com", "013");
		
		Bankaccount person3 = new Bankaccount();
		// this will call empty default constructor and empty constructor prints its 
		// default value, but first it calls other constructor.
		
		// Ohter constructor with 3 prmtrs
		Bankaccount person4 = new Bankaccount("Con3", "con@gmx.de", "888");
		
		//System.out.println("Your current balance " + person1.getBalance());
		person1.deposite(100);
		person2.deposite(250);
		System.out.println("Person1 has " + person1.getBalance() + " and Person2 has " + person2.getBalance());
	
		person1.withdraw(150);
		
		person1.deposite(51);
		person1.withdraw(150);
		
		person3.getBalance(); 
		person3.deposite(100);
		person3.withdraw(50);
		
		person4.withdraw(50);
	}

}
