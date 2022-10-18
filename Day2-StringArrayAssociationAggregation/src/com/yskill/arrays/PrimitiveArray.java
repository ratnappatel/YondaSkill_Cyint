package com.yskill.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PrimitiveArray {

	public static void main(String[] args) {
	
		Integer arr[]=new Integer[5];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter marks of students");
		for(int i=0;i<5;i++)
			arr[i]=sc.nextInt();
		
		System.out.println("Descending Order......");
		
		Arrays.sort(arr,Collections.reverseOrder());
		for(int i=0;i<=5;i++)
			System.out.println("arr ["+i+"] = "+arr[i]);
	}

}
