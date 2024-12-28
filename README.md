Project Overview
The Bank Account Management System is a console-based Java application that simulates basic banking operations such as creating customer accounts, making deposits, withdrawing funds, and displaying customer information. This project demonstrates the use of Object-Oriented Programming (OOP) principles in Java.

Key Entities
Account

Attributes: accountNumber, balance.

Methods: deposit(), withdraw(), getAccountNumber(), getBalance(), toString().

Description: Represents a bank account with a unique account number and balance. It includes methods to deposit and withdraw funds, as well as a toString() method to provide a human-readable representation of the account.

Customer

Attributes: name, customerId, account.

Methods: getName(), getCustomerId(), getAccount(), toString().

Description: Represents a bank customer with a name, unique customer ID, and an associated bank account. The toString() method provides a human-readable representation of the customer.

Bank

Attributes: customers (a list of Customer objects).

Methods: addCustomer(), searchCustomerById(), deposit(), withdraw(), displayCustomers(), generateCustomerId().

Description: Manages the collection of customers and their accounts. It includes methods to add new customers, search for customers by ID, perform deposit and withdrawal operations, display all customers, and generate unique customer IDs.

Functionality
Add Customer: Allows the user to add a new customer to the bank. The user inputs the customer's name and initial balance. A unique customer ID is generated, and the customer is added to the bank's list of customers.

Deposit: Allows the user to deposit a specified amount into a customer's account. The user inputs the customer ID and the deposit amount.

Withdraw: Allows the user to withdraw a specified amount from a customer's account. The user inputs the customer ID and the withdrawal amount.

Display Customers: Displays the details of all customers in the bank, including their account information.

Exit: Exits the application.
