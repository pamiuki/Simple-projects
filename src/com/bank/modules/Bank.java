package com.bank.modules;

import java.util.ArrayList;

public class Bank {
	private String name;
	private ArrayList<Branch> branches;
	
	public Bank(String name) {
		this.name = name;
		this.branches = new ArrayList<>();
	}
	
	public boolean addBranch(String name) {
		if(findBranch(name)==null) {
		
		this.branches.add(new Branch(name));
		return true;
		}
		return false;		
	}
	
	private Branch findBranch(String name) {
		
		for(Branch branch : this.branches) {
			if(branch.getName().equals(name)) return branch;
		}
		return null;
	}
	
public boolean addCustomer(String branchName, String customer, double initialTransaction) {
		if(findBranch(branchName) == null) {
		return false;
		}
		return findBranch(branchName).newCustomer(customer, initialTransaction);
	}
	
	public boolean addCustomerTransaction(String branchName, String customer, double transaction) {
		if(findBranch(branchName) == null) return false;
		
	return 	findBranch(branchName).addCustomerTransaction(customer, transaction);
	}
	
	public boolean listCustomers(String branchName, boolean printTransactions) {
		
		if(findBranch(branchName) != null && printTransactions == false) {
			System.out.println("Customer details for branch " + branchName);
			for(int i = 0; i < this.branches.size(); i++) {
				for(int j = 0; j<this.branches.get(i).getCustomers().size(); j++) {
					System.out.println("Customer: " + 
							this.branches.get(i).getCustomers().get(j).getName() + "[" + (j+1) + "]");
				}	
			}
			return true;
		} else if(findBranch(branchName) != null && printTransactions == true) {
			System.out.print("Customer details for branch " + branchName + "\n");
			//To print the list of customers in a branch and transaction list or summary of each customer, we would use three for-loops 
			//The first for-loop would control of the flow of the branches
			for(int i = 0; i < this.branches.size(); i++) {
				//The second for-loop would control teh flow of the customers in a particular branch
				for(int j = 0; j < this.branches.get(i).getCustomers().size();j++) {
					System.out.println("Customer: " + this.branches.get(i).getCustomers().get(j).getName() + "[" + (j+1) + "]");
					System.out.println("Transactions");
					//The third for-loop would control the flow of each customer's transactions
					for(int k =0; k<this.branches.get(i).getCustomers().get(j).getTransactions().size(); k++) {
						System.out.println("[" + (k+1) + "]  Amount " +
								this.branches.get(i).getCustomers().get(j).getTransactions().get(k));
					}
				}
			}
			return true;
		}
		return false;
	}

}
