package com.yskill.generics;

// For Type Safety it can accept Generics
public class TestGeneric<T> {

	T obj;
	public TestGeneric(T obj) {
		this.obj=obj;
	}
	public T getObject() {
		return this.obj;
	}
	
}
