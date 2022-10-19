package com.yskill.wrappers;

public class WrapperTypeConversion {

	public static void main(String[] args) {

		int x=129;
		Integer i=x;
		byte b=i.byteValue(); // implicit type conversion will not work because lower<--Upper
		System.out.println("x as int = "+x);
		System.out.println("x as byte = "+b);
		//byte range -128 to 127
		
		long y=x; // implicit type conversion taking place 
		System.out.println("x as int = "+x);
		System.out.println("x as long = "+y);
	}

}
