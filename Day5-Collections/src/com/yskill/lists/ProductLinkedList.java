package com.yskill.lists;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ProductLinkedList {

	public static void main(String[] args) {

			
			LinkedList<Product> products=new LinkedList<Product>();
			products.add(new Product(23, "Keyboard", 2300.78, 4));
			products.add(new Product(63, "LED Screen", 7850.99, 5));
			products.add(new Product(17, "Mother Board", 15000.25, 3));
			products.add(new Product(72, "RAM", 4500.57, 3));
			products.add(new Product(81, "ROM", 7353.83, 2));
			products.add(new Product(39, "External Hard Disk", 3999.19, 4));
			
			System.out.println(products);
			
			System.out.println("Sorted Product List");
			Collections.sort(products); //?
			System.out.println(products);
			
			ListIterator<Product> itr=products.listIterator();
			
			  while(itr.hasNext()) {
			  System.out.println("======================================="); Product
			  p=itr.next(); System.out.println("Product Id : "+p.getId());
			  System.out.println("Product Title : "+p.getTitle());
			  System.out.println("Product Price : "+p.getPrice());
			  System.out.println("Product Rating : "+p.getRating()); }
			 
			
			System.out.println("Backward List Traversal");
			
			while(itr.hasPrevious())
			{
				System.out.println("=======================================");
				Product p=itr.previous();
				System.out.println("Product Id : "+p.getId());
				System.out.println("Product Title : "+p.getTitle());
				System.out.println("Product Price : "+p.getPrice());
				System.out.println("Product Rating : "+p.getRating());
			}

		}

}
