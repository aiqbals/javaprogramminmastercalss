package constructorlearning;

public class Bankaccount {

	private String accNumber;
	private double balance;
	private String customerName;
	private String customerEmail;
	private String customerPhnNo;

	// this empty constructor sets default value and call this constructors when no
	// parameter are set. If call this constructor, it first call other constructor
	// and if not value finds, it executes itself.
	public Bankaccount() {
		this("03", 5.00, "Default name", "Defautl email", "Default phoneno");
		// this will be always the first statement in empty constructor body
		System.out.println("Empty constructor called");
	}

	// Constructor - an way of setting fields to set initial values
	public Bankaccount(String accNumber, double balance, String name, String email, String phnno) {
		this.accNumber = accNumber; // Standard and gen rule of thumb
		//setAccNumber(accNumber);
		// advantage of it is, it now can be validated incase it is a valid no. in the method
		this.balance = balance;
		this.customerName = name;
		this.customerEmail = email;
		this.customerPhnNo = phnno;
		System.out.println("Bankaccount constructor is called");
	}
	
	// other two constructor - constructor overloading
	// Constructor - an way of setting fields to set initial values
		public Bankaccount(String name, String email, String phnno) {
			this("999", 100.50, name, email, phnno);
			// we can set two default paramtr 'accno', 'balance' to update automatically this way
			System.out.println("Other constructor with 3 prmtrs is called");
		}

	// Other way to set field value
	public void setAccNumber(String accNumber) {
		// check or validte parameter
		this.accNumber = accNumber;
	}

	public void setBalance(double balance) {
		// check or validte parameter
		this.balance = balance;
	}

	public void setCustomerName(String customerName) {
		// check or validte parameter
		this.customerName = customerName;
	}

	public void setCustomerEmail(String customerEmail) {
		// check or validte parameter
		this.customerEmail = customerEmail;
	}

	public void setCustomerPhnNo(String customerPhnNo) {
		// check or validte parameter
		this.customerPhnNo = customerPhnNo;
	}

	public String getAccNumber() {
		return this.accNumber;
	}

	public double getBalance() {
		return this.balance;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public String getCustomerEmail() {
		return this.customerEmail;
	}

	public String getCustomerPhnNo() {
		return this.customerPhnNo;
	}

	// withdraw and deposite methods
	public void withdraw(double amount) {
		// if((this.balance - amount) < 0)
		if (amount > this.balance) {
			System.out.println("Insufficient fund! Your current balance is only " + this.balance);
		} else {
			this.balance -= amount;
			System.out.println("You just withdraw " + amount + ". Your remaining balance " + this.balance);
		}
	}

	public void deposite(double amount) {
		this.balance += amount;
		System.out.println("You just deposited " + amount + ". Your new balance " + this.balance);
	}
}
