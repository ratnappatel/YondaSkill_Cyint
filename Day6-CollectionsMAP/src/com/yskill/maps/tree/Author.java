package com.yskill.maps.tree;

import java.util.Objects;

public class Author  implements Comparable<Author>
{
 
	private int id;
	private String name;
	private int noOfBooks;
	public Author() {
		// TODO Auto-generated constructor stub
	}
	
	public Author(int id, String name, int noOfBooks) {
		super();
		this.id = id;
		this.name = name;
		this.noOfBooks = noOfBooks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNoOfBooks() {
		return noOfBooks;
	}

	public void setNoOfBooks(int noOfBooks) {
		this.noOfBooks = noOfBooks;
	}

	@Override
	public String toString() {
		return "Author \n[id=" + id + ", name=" + name + ", noOfBooks=" + noOfBooks + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, noOfBooks);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		return id == other.id && Objects.equals(name, other.name) && noOfBooks == other.noOfBooks;
	}

	@Override
	public int compareTo(Author o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
}
