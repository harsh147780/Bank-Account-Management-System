package bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private List<Customer> customers;
	
	public Bank() {
		this.customers = new ArrayList<>();
	}
	
	public void addCustomer(Customer customer) {
		customers.add(customer);
		}
	
	public Customer searchCustomerById(int customerId) {
		for(Customer customer : customers) {
			if(customer.getCustomerId() == customerId) {
				return customer;
			}
		}
		return null;
	}
	
	public void deposite(int customerId , double amount) {
		Customer customer = searchCustomerById(customerId);
		if(customer != null) {
			customer.getAccount().deposite(amount);
			System.out.println("Deposit successful. New balance: " + customer.getAccount().getBalance());
		}
		else {
			System.out.println("Customer not found!.");
		}
	}
	
	public void withdraw(int customerId , double amount) {
		Customer customer = searchCustomerById(customerId);
		if(customer != null) {
			customer.getAccount().withdraw(amount);
			System.out.println("Withdraw successfull. New balance: " + customer.getAccount().getBalance());
		}else {
			System.out.println("Customer not found!.");
		}
	}
	
	public void displayCustomers() { 
		for (Customer customer : customers) {
			System.out.println(customer); 
			} 
		}
	
	public int generateCustomerId(){
		return customers.size() + 1;
		}

}
