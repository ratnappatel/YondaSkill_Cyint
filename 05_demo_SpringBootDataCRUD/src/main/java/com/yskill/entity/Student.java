package com.yskill.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rollno;
	private String name;
	private String stream;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int rollno, String name, String stream) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.stream = stream;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", stream=" + stream + "]\n";
	}
	
	

}
