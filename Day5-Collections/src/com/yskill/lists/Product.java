package com.yskill.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Product implements Comparable<Product>{
	
	private int id;
	private String title;
	private double price;
	private int rating;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String title, double price, int rating) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.rating = rating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", title=" + title + ", price=" + price + ", rating=" + rating + "]\n";
	}
	@Override
	public int compareTo(Product p) {
		
		//return this.id-p.id;
		return this.title.compareTo(p.title);
	}
	
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
