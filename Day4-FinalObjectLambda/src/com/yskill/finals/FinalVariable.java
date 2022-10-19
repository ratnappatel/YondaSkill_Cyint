package com.yskill.finals;

public final class FinalVariable {
	private final int id;
	public FinalVariable(int id) {
		this.id=id;
	}
	public void print()
	{
		System.out.println("Id : "+id);
	}
	public final void calcInterest()
	{
		System.out.println("You have to apply 8% of Intereset on Home Loans");
	}

	public static void main(String[] args) {
		FinalVariable fv=new FinalVariable(10);
		fv.print();	

	}
}

class FinalMethod //extends FinalVariable
{
	public FinalMethod(int id) {
		//super(id);
	}
	public void calcInterest()
	{
		
	}
	
}
