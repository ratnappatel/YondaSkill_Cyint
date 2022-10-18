package com.yskill.strings;

public class StringMethods {

	public static void main(String[] args) {

		String email="ratnabpatel@gmail.com";
		String sentence="Today is 2nd day of our training modules";
		
		boolean flag=email.contains("@");
		System.out.println("email is valid : "+flag);
		
		String []words=sentence.split(" ");
		System.out.println("Given sentence contains "+words.length+" words in it.");
	}

}
