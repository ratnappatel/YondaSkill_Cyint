package com.yskill.polymorphism;

import java.util.Scanner;

public class PokemonGameApp {

	public static void main(String[] args) {
	
		Pokemon p=new Pokemon();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Points Earned so Far");
		int points=sc.nextInt();
		
		if(points>5000)
		{
			System.out.println("You can Upgrade Pokemon to an Advanced Pokemon");
			System.out.println("1. Flying Pokemon");
			System.out.println("2. Aqua Pokemon");
			int type=sc.nextInt();
			if(type==1)
				p=new FlyingPokemon();
			else if(type==2)
				p=new AquaPokemon();
				
		}
		else
		{
			int req=5000-points;
			System.out.println("To upgrade you have to earn "+ req+" more points");
		}
		p.play();

	}

}
