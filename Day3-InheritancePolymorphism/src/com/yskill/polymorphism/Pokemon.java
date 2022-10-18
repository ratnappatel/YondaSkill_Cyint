package com.yskill.polymorphism;

public class Pokemon {
	
	public void play()
	{
		System.out.println("Play by Running");
	}
}

class FlyingPokemon extends Pokemon
{
	public void play()
	{
		System.out.println("Play by Flying");
	}
}

class AquaPokemon extends FlyingPokemon
{
	public void play()
	{
		System.out.println("Play by Flying+Swimming");
	}
}