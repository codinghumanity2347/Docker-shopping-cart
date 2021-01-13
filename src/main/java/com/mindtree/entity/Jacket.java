package com.mindtree.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jacket implements Comparable<Jacket>{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int jacketId;
	private String jacketColor;
	private int jacketDiscount;
	private int jacketPrice;

	public Jacket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Jacket(int jacketId, String jacketColor, int jacketDiscount, int jacketPrice) {
		super();
		this.jacketId = jacketId;
		this.jacketColor = jacketColor;
		this.jacketDiscount = jacketDiscount;
		this.jacketPrice = jacketPrice;
	}

	public int getJacketId() {
		return jacketId;
	}

	public void setJacketId(int jacketId) {
		this.jacketId = jacketId;
	}

	public String getJacketColor() {
		return jacketColor;
	}

	public void setJacketColor(String jacketColor) {
		this.jacketColor = jacketColor;
	}

	public int getJacketDiscount() {
		return jacketDiscount;
	}

	public void setJacketDiscount(int jacketDiscount) {
		this.jacketDiscount = jacketDiscount;
	}

	public int getJacketPrice() {
		return jacketPrice;
	}

	public void setJacketPrice(int jacketPrice) {
		this.jacketPrice = jacketPrice;
	}

	@Override
	public String toString() {
		return "Jacket [jacketId=" + jacketId + ", jacketColor=" + jacketColor + ", jacketDiscount=" + jacketDiscount
				+ ", jacketPrice=" + jacketPrice + "]";
	}

	@Override
	public int compareTo(Jacket j) {
		// TODO Auto-generated method stub
		
		return j.jacketPrice-this.jacketPrice;
	}

}
