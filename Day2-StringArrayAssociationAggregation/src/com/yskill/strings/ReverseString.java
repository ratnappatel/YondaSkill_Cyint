package com.yskill.strings;

public class ReverseString {

	public static void main(String[] args) {
		
		String s1="Yonda Skill";
		String reverseS1="";
		for(int i=0;i<s1.length();i++)
			reverseS1+=s1.charAt(i); // n+1
		System.out.println("Reverse String "+reverseS1);
		
		
	
		StringBuffer sb=new StringBuffer(s1);
		s1=sb.reverse().toString(); // 2-new objects gets created..
		System.out.println("Reverse String "+s1);
	}

}
