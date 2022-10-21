package com.yskill.maps.customeKey;

import java.util.Objects;

public class Person {

	private String name;
	private String email;
	private int age;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String name, String email, int age) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", age=" + age + "]\n";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, email, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(email, other.email) && Objects.equals(name, other.name);
	}
	
	
	
	
}
