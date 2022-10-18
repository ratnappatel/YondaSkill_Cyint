package com.yskill.inherit;

public class TestOverriding {

	public static void main(String[] args) {
		ProjectManager p; // abstract class cannot be instantiated
		
		p=new DeveloperEmployee();
		p.commitBackUp();
		p.print();
		//p.getDeveloper();
		
		p=new TestEngineerEmployee();
		p.commitBackUp();
		p.print();
	}
	

}
