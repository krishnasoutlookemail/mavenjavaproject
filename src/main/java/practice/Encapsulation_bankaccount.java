package practice;

public class Encapsulation_bankaccount {

	public static void main(String[] args) {
		// setting value using parameterized constructor
		//BankAccount b1=new BankAccount("12345A","Krishna",5000.50);
		//System.out.println(b1.balance+10.0); if we give public variable then someone can modify like this
		
		
		/*System.out.println("Account number is "+b1.getAccountNumber());
		System.out.println("Account holder is "+b1.getAccountHoldername());
		System.out.println("Initial balance is "+b1.getbalance());
		b1.deposit(10.00);
		System.out.println("Updated balance is "+b1.getbalance());*/
		
		//setting value using setter method
		BankAccount b2=new BankAccount();
		b2.setaccountNumber("123abc");
		b2.setAccountHoldername("Krishna");
		b2.setBalance(5000);
		System.out.println("Account number is "+b2.getAccountNumber());
		System.out.println("Account holder is "+b2.getAccountHoldername());
		System.out.println("Initial balance is "+b2.getbalance());
		b2.deposit(10.00);
		System.out.println("Updated balance is "+b2.getbalance());
		b2.withdraw(15);
		System.out.println("Updated balance is "+b2.getbalance());
		
		

	}

}
