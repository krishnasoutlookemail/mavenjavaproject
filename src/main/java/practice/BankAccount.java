package practice;

public class BankAccount {
	//all private variables or fields
	private String accountNumber;
	private String accountHolder;
	private double balance;
	
	//parameterized constructor
/*public BankAccount(String accountNumber,String accountHolder,double balance) {
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
		this.balance=balance;
	}*/
	
	//setter methods
	public void setaccountNumber(String accountNumber) {
		this.accountNumber=accountNumber;
		
	}
	public void setAccountHoldername(String accountHolder) {
		this.accountHolder=accountHolder;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
	//getter methods
	public String getAccountNumber() {
		return accountNumber;
	}
	public String getAccountHoldername() {
		return accountHolder;
	}
	public double getbalance() {
		return balance;
	}
	//method to deposit a money
	public void deposit(double amount) {
		if(amount>0) {
			balance=balance+amount;
			System.out.println(amount + "$deposited successfully");
		}
		else {
			System.out.println("invalid amount value");
		}
	}
	//method to withdraw some money
		public void withdraw(double amount) {
			if(amount>0) {
				balance=balance-amount;
				System.out.println(amount + "$withdrawed successfully");
			}
			else {
				System.out.println("invalid amount value");
			}
		}
}
