package com.yskill.maps.customeKey;

import java.util.Objects;

public class Identity implements Comparable<Identity> {
	private int aadharNo;
	private int panNo;
	public Identity() {
		// TODO Auto-generated constructor stub
	}
	public Identity(int aadharNo, int panNo) {
		super();
		this.aadharNo = aadharNo;
		this.panNo = panNo;
	}
	public int getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(int aadharNo) {
		this.aadharNo = aadharNo;
	}
	public int getPanNo() {
		return panNo;
	}
	public void setPanNo(int panNo) {
		this.panNo = panNo;
	}
	@Override
	public String toString() {
		return "Identity [aadharNo=" + aadharNo + ", panNo=" + panNo + "] :: ";
	}
	@Override
	public int hashCode() {
		return Objects.hash(aadharNo, panNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Identity other = (Identity) obj;
		return aadharNo == other.aadharNo && panNo == other.panNo;
	}
	@Override
	public int compareTo(Identity i) {
		
		return this.aadharNo-i.aadharNo;
	}
	
	
	

}
