package com.yskill.sets;

import java.util.HashSet;

import com.yskill.lists.Product;

public class HashSetProduct {

	public static void main(String[] args) {
		HashSet<Product> products=new HashSet<Product>();
		products.add(new Product(23, "Keyboard", 2300.78, 4));//10
		products.add(new Product(63, "LED Screen", 7850.99, 5));
		products.add(new Product(17, "Mother Board", 15000.25, 3));//25
		products.add(new Product(72, "RAM", 4500.57, 3));
		products.add(new Product(81, "ROM", 7353.83, 2));
		products.add(new Product(63, "LED Screen", 7850.99, 5));
		products.add(new Product(17, "Mother Board", 15000.25, 3));//26
		products.add(new Product(39, "External Hard Disk", 3999.19, 4));
		
		System.out.println(products);
		
		products.stream().sorted().forEach(System.out::println);

	}

}
