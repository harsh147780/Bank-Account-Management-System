package bank;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank();
		
		while(true) {
			System.out.println("1 Add Customer");
			System.out.println("2  Deposite");
			System.out.println("3  Withdraw");
			System.out.println("4  Display Customer");
			System.out.println("5  Exit");
			System.out.println("Enter your choice : ");
			int choice  = sc.nextInt();
			
			switch(choice) {
			case 1 :
				System.out.println("Enter Customer Name : ");
				String name = sc.next();
				System.out.println("Enter initial balance : ");
				double initialBalance = sc.nextDouble();
				int customerId = bank.generateCustomerId();
				Account account = new Account(customerId, initialBalance);
				Customer customer = new Customer(name, customerId, account);
				bank.addCustomer(customer);
				System.out.println("Customer added successfully.");
				break;
			
			case 2:
				System.out.print("Enter customer ID: ");
				customerId = sc.nextInt();
				System.out.print("Enter deposit amount: ");
				double depositAmount = sc.nextDouble(); 
				bank.deposite(customerId, depositAmount);
				break;
				
			case 3: System.out.print("Enter customer ID: ");
				customerId = sc.nextInt();
				System.out.print("Enter withdrawal amount: ");
				double withdrawAmount = sc.nextDouble();
				bank.withdraw(customerId, withdrawAmount);
				break;
			
			case 4:
				bank.displayCustomers();
				break;
			case 5:
				System.out.println("Exiting...");
				sc.close(); 
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}
			
		}
	}

}
