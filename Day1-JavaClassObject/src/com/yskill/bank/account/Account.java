package com.yskill.bank.account;

public class Account {

	
	 private double balance;
	 private String mobile;
	 private String address;
	 
	 // To initialize the class fields use Constructor
	 
	 public Account(double balance,String mobile, String address)
	 {
		 if(balance<10000)
		 {
			 	System.out.println("");
			 	System.exit(0);
		 }
		 this.balance=balance;
		 this.mobile=mobile;
		 this.address=address;
		 
	 }
	public double getBalance()
	{
		return this.balance;
	}
	 
	// Business Functions
	public void deposit(double amount)
	 {
		 this.balance=this.balance+amount;
	 }
	 public void withdraw(double amount)
	 {
		 this.balance=this.balance-amount;
	 }
	
	@Override
	public String toString() {
		return "Account [balance=" + balance + ", mobile=" + mobile + ", address=" + address + "]";
	}
	public static void main(String[] args) {
		
		Account ratna=new Account(240000, "9601290547", "B-507 Dwarika Apartment");
		System.out.println(ratna);
		
		Account uttam=new Account(19000, "9601290547", "B-507 Dwarika Apartment");
		System.out.println(uttam);
		
		
	}

}
