public class Account {
	private int accountNumber = 0;
	private String name;
	private double Balance;
	  private static int lastAccountNumber = 0;
	  
	public Account(String name, double intialBalance) {
		this.name = name;
		this.Balance = intialBalance;
		accountNumber = lastAccountNumber + 1;
		lastAccountNumber = accountNumber;
	}
	
	public Account(String name) {
		this.name = name;
		accountNumber = lastAccountNumber + 1;
		lastAccountNumber = accountNumber;
	}
	
	public double getBalance() {
		return Balance;
	}
	public void withdraw(double amount) {
		if(this.Balance >= amount && amount>0)
			this.Balance = this.Balance - amount;
	}
	public void deposit(double amount) {
		if(amount > 0)
			this.Balance = this.Balance + amount;
	}
	public static int getNextAccountNumber() {
		return lastAccountNumber + 1;
	}
	public String transaction(Account reciever, double amount){
		String result = new String();
		if(PaymentGateway.transfer(this, reciever, amount)) {
			result = "Payment Successful";
		}
		else {
			result = "Payment Failed";
		}
		return result;
	}
	@Override
	public String toString() {
		return "Account [id = " +accountNumber+ " name=" + name + ", initialBalance=" + Balance + "]";
	}
	
}