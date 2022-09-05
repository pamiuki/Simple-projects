package com.bank.modules;

import java.io.Console;
import java.io.IOException;
import java.util.Arrays;



public class Test {
	public static void main(String[] args) {
		Customer paul = new Customer("Paul", 500.54);
		Customer faith = new Customer("Faith", 500.6);
		Customer Netanya = new Customer("Netanya", 10000.5);
		
		System.out.println(paul.getTransactions());
		System.out.println(paul.getName());
		paul.addTransaction(1000.25);
		System.out.println(paul.getTransactions());
		
		Branch branch1 = new Branch("Mandria");
		
		System.out.println(branch1.newCustomer("Paul", 1002.23));
		branch1.newCustomer("Elkanah", 1500.78);
		branch1.newCustomer("Anastacia", 1000.2);
		System.out.println(branch1.newCustomer("Paul", 1002.23));
		
		branch1.addCustomerTransaction("Paul", 1500);
		System.out.println(branch1.addCustomerTransaction("Anastacia", 500));
		
		
		for(int i = 0; i< branch1.getCustomers().size(); i++) {
			System.out.println(branch1.getCustomers().get(i).getName());
		}
		System.out.println("");
		
		Bank bank = new Bank("National Australia Bank");

		bank.addBranch("Adelaide");

		bank.addCustomer("Adelaide", "Tim", 50.05);
		bank.addCustomer("Adelaide", "Mike", 175.34);
		bank.addCustomer("Adelaide", "Percy", 220.12);

		bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
		bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
		bank.addCustomerTransaction("Adelaide", "Mike", 1.65);

		bank.listCustomers("Adelaide", true);
		
		bank.listCustomers("Adelaide", false);
		
		
		
	

	
	

	}
}
