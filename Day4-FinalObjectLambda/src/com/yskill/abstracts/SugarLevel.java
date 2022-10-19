package com.yskill.abstracts;

public interface SugarLevel {
	int sugar=20;
	public abstract void addSugar(); 
	public default void increaseSugar()
	{
		System.out.println("From increaseSugar method");
	}

}
