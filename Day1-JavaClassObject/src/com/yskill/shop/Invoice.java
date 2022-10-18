package com.yskill.shop;

public class Invoice {
	
	public void printReceipt(String pname, double price,int qty)
	{
		System.out.println("Your Invoice ");
		System.out.println("Product : "+pname);
		System.out.println("Total Price "+(price*qty));
	}

}
