package com.yskill.generics;

import java.util.ArrayList;
import java.util.Scanner;

public class ObjectType {

	public static void main(String[] args) {
		// generics give us type safety 
		ArrayList<Double>  arr=new ArrayList<Double>();
		
		// collect sales of last week mon-fri and do total of it
		//arr.ensureCapacity(0);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Weekly Sale Amount");
		
		  for(int i=0;i<5;i++) 
			  arr.add(sc.nextDouble());
		 
		
			/*
			 * arr.add(45.67); arr.add(67.89); arr.add(123.435); arr.add(234.345);
			 * arr.add(23.789);
			 */
		
		double totalSale=0.0;
		for(int i=0;i<arr.size();i++)
			totalSale=totalSale+arr.get(i);
		
		System.out.println("Weekly Sale : "+totalSale);
		

	}

}
