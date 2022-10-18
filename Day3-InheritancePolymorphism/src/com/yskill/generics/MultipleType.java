package com.yskill.generics;

public class MultipleType<T, U> {
	T obj1;
	U obj2;
	public MultipleType(T obj1, U obj2) {
		this.obj1=obj1;
		this.obj2=obj2;
	}
	public void print()
	{
		System.out.println("T "+obj1);
		System.out.println("U "+obj2);
	}

}
