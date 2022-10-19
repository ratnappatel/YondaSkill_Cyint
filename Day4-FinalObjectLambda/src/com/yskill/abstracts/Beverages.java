package com.yskill.abstracts;

public abstract class Beverages {
	
	private int qty=20;
	public void addMilk()
	{
		System.out.println("Add Hot Milk");
	}
	public abstract void addIngredient();
}
class Tea extends Beverages implements SugarLevel{

	@Override
	public void addIngredient() {
		System.out.println("Add Tea leaf");
		
	}

	@Override
	public void addSugar() {
		System.out.println("add 1.5 gm sugar ");
		
	}}
class Coffee extends Beverages implements SugarLevel{

	@Override
	public void addIngredient() {

		System.out.println("Add Coffee Powder");
		
	}

	@Override
	public void addSugar() {
		
		
	}}

abstract class FlavouredMilk extends Beverages{
	
}
class CinnamonFlavouredMilk extends FlavouredMilk
{

	@Override
	public void addIngredient() {
		System.out.println("Add Cinnamon Powder + Honey");
		
	}
	
}
class CardemomFlavouredMilk extends FlavouredMilk
{

	@Override
	public void addIngredient() {

		System.out.println("Add Cardemom Powder");
		
	}
	
}