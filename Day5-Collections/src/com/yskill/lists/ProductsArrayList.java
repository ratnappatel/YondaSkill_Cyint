package com.yskill.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ProductsArrayList {

	public static void main(String[] args) {
		// List of Custom-Objects
		
		ArrayList<Product> products=new ArrayList<Product>();
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
		
		Iterator<Product> itr=products.iterator();
		while(itr.hasNext())
		{
			System.out.println("=======================================");
			Product p=itr.next();
			System.out.println("Product Id : "+p.getId());
			System.out.println("Product Title : "+p.getTitle());
			System.out.println("Product Price : "+p.getPrice());
			System.out.println("Product Rating : "+p.getRating());
		}

	}

}
