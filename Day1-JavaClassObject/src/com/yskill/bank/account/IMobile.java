package com.yskill.bank.account;

public class IMobile {
	
	public static void main(String[] args) {
		IMobile ratna=new IMobile(); //installed iMobile App
		Account a1=new Account(0, null, null);
		System.out.println(a1.getBalance());
		a1.deposit(1500000);
		System.out.println(a1.getBalance());
	}

}
