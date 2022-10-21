package com.yskill.maps;

import java.time.LocalDate;

public class OrderDetails {
	
	private double orderCost;
	private LocalDate orderDate;
	private int noOfItems;
	
	public OrderDetails() {
		// TODO Auto-generated constructor stub
	}

	public OrderDetails(double orderCost, LocalDate orderDate, int noOfItems) {
		super();
		this.orderCost = orderCost;
		this.orderDate = orderDate;
		this.noOfItems = noOfItems;
	}

	public double getOrderCost() {
		return orderCost;
	}

	public void setOrderCost(double orderCost) {
		this.orderCost = orderCost;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public int getNoOfItems() {
		return noOfItems;
	}

	public void setNoOfItems(int noOfItems) {
		this.noOfItems = noOfItems;
	}

	@Override
	public String toString() {
		return "OrderDetails [orderCost=" + orderCost + ", orderDate=" + orderDate + ", noOfItems=" + noOfItems + "]\n";
	}
	
}
