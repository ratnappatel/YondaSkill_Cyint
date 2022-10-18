package com.yskill.generics;

public class MainTestGenerics {

	public static void main(String[] args) {
		TestGeneric<Integer> tg=new TestGeneric<Integer>(145);
		System.out.println(tg.getObject());
		
		TestGeneric<Boolean> tg1=new TestGeneric<Boolean>(false);
		System.out.println(tg1.getObject());
		
		
		TestGeneric<String> tg2=new TestGeneric<String>("Cyint");
		System.out.println(tg2.getObject());
		
		MultipleType<Integer, String> mt=new MultipleType<Integer, String>(23556, "Ratna");
		mt.print();
	}

}
