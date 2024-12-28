package bank;

public class Customer {
	private String name;
	private int customerId;
	private Account account;
	
	public Customer(String name ,int customerId , Account account) {
		this.name = name;
		this.customerId = customerId;
		this.account = account;
	}
	
	public String getName() {
		return name;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	
	public Account getAccount() {
		return account;
	}
	
	@Override
	public String toString() {
		return "Customer Id : " + customerId + ", Name : " + name + " ," + account;
	}
	
}
