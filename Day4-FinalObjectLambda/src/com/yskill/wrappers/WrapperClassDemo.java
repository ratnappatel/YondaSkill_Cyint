package com.yskill.wrappers;

import java.util.ArrayList;

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(new Integer(123)); // Auto-boxing taking place int ==> Integer
		al.add(new Integer(567));
		al.add(new Integer(678));
		
		int total=0;
		for(int i=0;i<al.size();i++)
		{
			Integer x=(Integer)al.get(i);// un-Boxing takes place
			total=total+x.intValue();
		}
		System.out.println(al);
		System.out.println("Total of all elements : "+total);

		//un-Boxing Integer ==> int
	}

}

