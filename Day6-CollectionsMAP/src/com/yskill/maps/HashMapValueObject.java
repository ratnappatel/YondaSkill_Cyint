package com.yskill.maps;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Set;

public class HashMapValueObject {

	HashMap<Integer,OrderDetails> orders=new HashMap<Integer,OrderDetails>();
	OrderDetails od;
	public HashMapValueObject() {
		orders.put(36423, 
				new OrderDetails(78945.99, LocalDate.of(2019, 06, 24), 10));
		orders.put(74832, 
				new OrderDetails(89467.78, LocalDate.of(1989, 8, 11), 5));
		orders.put(2648, 
				new OrderDetails(74538.99, LocalDate.of(1998, 11, 30), 6));
		orders.put(16484, 
				new OrderDetails(98353.50, LocalDate.of(2011, 5, 26), 8));
	}
	
	
	public void findByOrderDetails(OrderDetails o2)
	{
		Set<Integer> keys=orders.keySet();
		for(int key:keys)
		{
			OrderDetails o1=orders.get(key);
			if(o1.equals(o2))
			{
				System.out.println("Your Order Id is : "+key);
				break;
			}
		}
		System.out.println("Order details are not found..");
	}
	public void findByOrderNumber(int orderId)
	{
		boolean exists=orders.containsKey(orderId);
		if(exists)
		{
			od=orders.get(orderId);
			System.out.println("Your Order Details are : \n"+od);
		}
		else
			System.out.println("Order with ID : "+orderId+" does not exists");
		
	}
	
	public void placeAnOrder(int id,OrderDetails o)
	{
		orders.put(id,o);
		System.out.println(orders);
	}
	
	public void updateOrderDetails(int id,OrderDetails newOrder)
	{
		boolean exists=orders.containsKey(id);
		if(exists)
		{
			orders.put(id, newOrder);
			System.out.println(orders);
		}
		else
			System.out.println("Order details are not found to be updated..");
	}
	
	public void cancelOrder(int id)
	{
		boolean exists=orders.containsKey(id);
		if(exists)
		{
			orders.remove(id);
			System.out.println("Order Cancelled Successfully..");
		}
		else
			System.out.println("Order details are not found with id : "+id);
	}
	
	public void printAllOrders()
	{
		Set<Integer> keys=orders.keySet();
		for(int key:keys)
			System.out.println(key+" = "+orders.get(key));
	}
		
	public static void main(String[] args) 
	{
			HashMapValueObject obj=new HashMapValueObject();
			obj.printAllOrders();
			System.out.println("=============================================");
			obj.placeAnOrder(34891, new OrderDetails(99999.99, LocalDate.of(2020, 9, 15), 18));
			obj.printAllOrders();
			System.out.println("=============================================");
			obj.updateOrderDetails(34891, new OrderDetails(65478.73, LocalDate.of(2020, 9, 15), 12));
			obj.printAllOrders();
			System.out.println("=============================================");
			obj.cancelOrder(34891);
			obj.printAllOrders();
			System.out.println("=============================================");
	}
}
