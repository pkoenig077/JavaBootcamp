package com.gc.shop;

public class ShoppingItem {

	private String pName;
	private float pPrice;
	private int pQuant;

	public ShoppingItem(String pName, float pPrice, int pQuant) {
		super();
		this.pName = pName;
		this.pPrice = pPrice;
		this.pQuant = pQuant;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public float getpPrice() {
		return pPrice;
	}

	public void setpPrice(float pPrice) {
		this.pPrice = pPrice;
	}

	public int getpQuant() {
		return pQuant;
	}

	public void setpQuant(int pQuant) {
		this.pQuant = pQuant;
	}
}
