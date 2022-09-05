package com.bank.modules;

import java.util.ArrayList;


public class Branch {
	private String name;
	private ArrayList<Customer> customers;
	
	public Branch(String name) {
		this.name = name;
		this.customers = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}
	
	public boolean newCustomer(String name, double initialTransaction) {
		if(findCustomer(name) == null) {
		this.customers.add(new Customer(name, initialTransaction));
		return true;
		}
		
		return false;
	}
	
	public boolean addCustomerTransaction(String name, double transaction) {
		if(findCustomer(name)==null) return false;
		findCustomer(name).addTransaction(transaction);
		return true;
	}
	
	private Customer findCustomer(String name) {
		for(Customer customer : this.customers) {
			if(customer.getName().equals(name)) return customer;
		}
		return null;
	}
}
