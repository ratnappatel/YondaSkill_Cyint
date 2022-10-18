package com.yskill.bank.methods;

public class ByReference {

	int no;
	public ByReference(int no) {
		this.no=no;
	}
	void modify(ByReference rRef)
	{
		System.out.println("rRef = "+rRef.hashCode());
		System.out.println("Prior to Modification r.no = "+this.no); //20
		this.no=this.no+20;	
		System.out.println("After to Modification rRef.no = "+this.no); 
	}
	public static void main(String[] args) {

		ByReference r=new ByReference(20);
		System.out.println("r  = "+r.hashCode());
		r.modify(r);
		System.out.println("After Modification "+r.no);
	}

}
