package com.yskill.strings;

public class StringPool {

	public static void main(String[] args) {

		String s1="Hello"; // creating a string literal
		String s2="Hello";
		String s3=new String("Hello");
		
		System.out.println("s1 hash code = "+s1.hashCode());
		System.out.println("s2 hash code = "+s2.hashCode());
		System.out.println("s3 hash code = "+s3.hashCode());
		System.out.println("===================================");
		if(s1==s2)
			System.out.println("s1 == s2");
		else
			System.out.println("s1 != s2");
		
		if(s1 == s3)
			System.out.println("s1 == s3");
		else
			System.out.println("s1 != s3");
		
		s1=s1+" World";
		System.out.println("=======================================");
		System.out.println("s1 hash code = "+s1.hashCode());
		System.out.println("s2 hash code = "+s2.hashCode());
		
		
		System.out.println("===================================");
		
		StringBuffer sb1=new StringBuffer("Hello");
		StringBuffer sb2=new StringBuffer("Hello");
		System.out.println("sb1 hash code = "+sb1.hashCode());
		System.out.println("sb2 hash code = "+sb2.hashCode());
		
		sb2.append(" World");
		
		System.out.println("sb1 hash code = "+sb1.hashCode());
		System.out.println("sb2 hash code = "+sb2.hashCode());
		
	}

}
