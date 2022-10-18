package com.yskill.shop;

public class Order {
	
	String pname;
	double price;
	Invoice i; // non-primitive variable ==> MUST INITIALIZE EXPLICITLY
	public Order(String pname, double price) {
		i=new Invoice();
		this.pname = pname;
		this.price = price;
	}

	public void placeOrder(int qty)
	{
		i.printReceipt(pname, price, qty);
	}

}
