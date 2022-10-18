package com.yskill.inherit;

public class TestEngineerEmployee extends ProjectManager{

	@Override
	public void commitBackUp() {
		System.out.println("commitBackUp From TestEngineer");
		
	}
	public void getTestEngineer()
	{
		System.out.println("getTestEngineer ");
	}

	public void print()
	{
		System.out.println("From TestEngineerEmployee");
	}
}
