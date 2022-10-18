package com.yskill.inherit;

public class Main {

	public static void main(String[] args) {
		Child c=new Child(); // ==> provoking parent constructor 		
	}}
class Parent{
	private int id;
	private String title;
	private String desc;
	private double price;
	public Parent() {
		// TODO Auto-generated constructor stub
	}
	public Parent(int id, String title, String desc, double price) {
		super();
		this.id = id;
		this.title = title;
		this.desc = desc;
		this.price = price;
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
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}	

	
}// Simple Inheritance
class Child extends Parent
{
	private String authorName;
	// default constructor [no-arg constructor ] is implicitly available
	public Child() {
		// is useful to declare empty object
	}
	public Child(int id, String title,String desc, double price,String authorName)
	{
		super(id,title,desc,price);
		this.authorName=authorName;
	}
	public void display()
	{
		System.out.println("id : "+getId());
		System.out.println("Title : "+getTitle());
		System.out.println("Author Name : "+authorName);
	}
}
