package com.yskill.inherit;

public class DeveloperEmployee  extends ProjectManager
{

	@Override // dynamic polymorphism
	public void commitBackUp() {
		System.out.println("commitBack from Developer");
		
	}
	public void print()
	{
		System.out.println("From DeveloperEmployee");
	}
	public void getDeveloper()
	{
		System.out.println("getDeveloper of DeveloperEmployee");
	}
}
