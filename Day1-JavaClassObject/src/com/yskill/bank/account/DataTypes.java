package com.yskill.bank.account;

public class DataTypes {
	
	private int accountNo;
	
	int x; // instance_variable are bydefault initialized with their respective initial value

	public DataTypes(int accountNo) {
		System.out.println("x = "+x);
		this.accountNo = accountNo;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public static void main(String args[])
	{
		int y=0; // local_variable
		
		DataTypes d=new DataTypes(299015); // non-primitive datatypes reference variable
		
		{
			int z=10;
		}
		System.out.println("Account No "+d.getAccountNo());
		System.out.println("d = "+d); // invokes toString();
		System.out.println("y = "+y);
		//System.out.println("z = "+z);
	}
	

}
