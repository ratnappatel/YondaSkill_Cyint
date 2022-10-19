package com.yskill.interfaces;

public class iMobile implements MyInterface {
	
	public void getBalance()
	{
		System.out.println("Available Balance : 250000");
	}
	public void validateCreditCard(String number)
	{
		int total=0;
		for(int i=0;i<number.length();i=i+2)
		{
			char c=number.charAt(i);
			total+=(int)c;
		}
		if(total%2==0)
			System.out.println("Credit Card number is valid");
		else
			System.out.println("Credit Card number is Not valid");
			
	}

}
