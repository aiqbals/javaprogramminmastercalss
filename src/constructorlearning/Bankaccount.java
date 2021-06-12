package constructorlearning;

public class Bankaccount {
	
	private String accNumber;
	private double balance;
	private String customerName;
	private String customerEmail;
	private String customerPhnNo;
	
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
	// this empty constructor sets default value and call this constructors when no parameter sets for other constructor.
	public Bankaccount() {
		this("03", 5.00, "Default name", "Defautl email", "Default phoneno");
		// this will be always the first statement in empty constructor body
		System.out.println("Empty constructor called");
	}
	
	// Other way of setting fields to set initial values
	public Bankaccount(String accNumber, double balance, String name, String email, String phnno) {
		// check or validte parameter
		this.accNumber = accNumber;
		this.balance = balance;
		this.customerName = name;
		this.customerEmail = email;
		this.customerPhnNo = phnno;
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
		//if((this.balance - amount) < 0)
		if(amount > this.balance) {
			System.out.println("Insufficient fund! Your current balance is only " + this.balance);
		} else {
			this.balance -= amount;
			System.out.println("You just withdraw " + amount + ". Your remaining balance "+ this.balance);
		}	
	}
	
	public void deposite(double amount) {	
		this.balance += amount;
		System.out.println("You just deposited " + amount + ". Your new balance " + this.balance);
	}
}
