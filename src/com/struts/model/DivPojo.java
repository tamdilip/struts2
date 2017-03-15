package com.struts.model;

public class DivPojo {
	public int num;
	public int denom;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		System.out.println("DivPojo Set :"+num);
		this.num = num;
	}
	public int getDenom() {
		return denom;
	}
	public void setDenom(int denom) {
		System.out.println("DivPojo Get :"+denom);
		this.denom = denom;
	}
}
