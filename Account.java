package bank;

public class Account {
	private int accountNumber ;
	private double balance;
	
	public Account(int accountNumber , double initialBalance) {
		this.accountNumber = accountNumber ;
		this.balance = initialBalance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	public void deposite(double amount) {
		if(amount >0) {
			balance += amount;
		} else {
			System.out.println("Invalid Deposite Amount!.");
		}
	}
	
	public void withdraw(double amount) {
		if(amount >0 && amount <= balance) {
			balance -= amount;
			
		}else {
			System.out.println("Invalid withdraw amount!.");
		}
	}
	
	@Override
	public String toString() {
		return "Account Number : " + accountNumber + "Balance : " + balance ;
	}
	

}
