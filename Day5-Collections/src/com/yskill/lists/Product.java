package com.yskill.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

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
		//return this.title.compareTo(p.title);
		return (int) (this.price-p.price);
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, price, rating, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return id == other.id && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& rating == other.rating && Objects.equals(title, other.title);
	}
	

	
	
}
