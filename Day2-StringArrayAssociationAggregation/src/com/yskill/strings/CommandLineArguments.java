package com.yskill.strings;

public class CommandLineArguments {

	public static void main(String[] args) {
		
		System.out.println(args[0]);
		for(int i=0;i<args.length;i++)
		{
			System.out.println("args ["+i+"] = "+args[i]);
			System.out.println(args[i].getClass());
			Integer no = Integer.parseInt(args[i]);
			System.out.println(no.getClass());
		}
	}
}


