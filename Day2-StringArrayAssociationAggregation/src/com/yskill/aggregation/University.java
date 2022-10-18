package com.yskill.aggregation;

public class University {

	public static void main(String[] args) {
		University u=new University();
		Address a1=new Address(34, "Lotus Street", "Jaipur");
		Faculty mudrika=new Faculty("Mudrika", a1);
		
		Address a2=new Address(56,"Heerabagh Flats","Udaipur");
		Student uttam=new Student("IIT", a2);

	}

}
