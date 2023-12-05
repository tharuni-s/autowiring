package com.autowiring;

public class Pancard {
	String panHolderName;
	public String getPanHolderName() {
		return panHolderName;
	}
	public void setPanHolderName(String panHolderName) {
		this.panHolderName = panHolderName;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	String panNumber;
	public String toString()
	{
		return (panHolderName+" "+panNumber);
	}

}
