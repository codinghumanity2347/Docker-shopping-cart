package com.mindtree.dto;

public class ShirtDto implements Comparable<ShirtDto>{
	private int shirtId;
	private String shirtName;
	private int shirtDiscount;
	private int shirtPrice;

	public ShirtDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ShirtDto(int shirtId, String shirtName, int shirtDiscount, int shirtPrice) {
		super();
		this.shirtId = shirtId;
		this.shirtName = shirtName;
		this.shirtDiscount = shirtDiscount;
		this.shirtPrice = shirtPrice;
	}

	public int getShirtId() {
		return shirtId;
	}

	public void setShirtId(int shirtId) {
		this.shirtId = shirtId;
	}

	public String getShirtName() {
		return shirtName;
	}

	public void setShirtName(String shirtName) {
		this.shirtName = shirtName;
	}

	public int getShirtDiscount() {
		return shirtDiscount;
	}

	public void setShirtDiscount(int shirtDiscount) {
		this.shirtDiscount = shirtDiscount;
	}

	public int getShirtPrice() {
		return shirtPrice;
	}

	public void setShirtPrice(int shirtPrice) {
		this.shirtPrice = shirtPrice;
	}

	@Override
	public String toString() {
		return "ShirtDto [shirtId=" + shirtId + ", shirtName=" + shirtName + ", shirtDiscount=" + shirtDiscount
				+ ", shirtPrice=" + shirtPrice + "]";
	}

	@Override
	public int compareTo(ShirtDto s) {
		// TODO Auto-generated method stub
		return s.shirtPrice - this.shirtPrice;
	}

}
