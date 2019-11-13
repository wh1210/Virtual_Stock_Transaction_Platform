package com.virtualStockPlatform.entity;

public class Stock {
	private int stock_Id;
	
	private String name;
	
	private double singlePrice;
	
	private int number;
	
	private double totalProperty;
	
	public Stock() {}

	public double getSinglePrice() {
		return singlePrice;
	}

	public void setSinglePrice(double singlePrice) {
		this.singlePrice = singlePrice;
	}

	public double getTotalProperty() {
		return totalProperty;
	}

	public void setTotalProperty(double totalProperty) {
		this.totalProperty = totalProperty;
	}

	public int getStock_Id() {
		return stock_Id;
	}

	public void setStock_Id(int stock_Id) {
		this.stock_Id = stock_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return singlePrice;
	}

	public void setPrice(double price) {
		this.singlePrice = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Stock [stock_Id=" + stock_Id + ", name=" + name + ", singlePrice=" + singlePrice + ", number=" + number
				+ ", totalProperty=" + totalProperty + "]";
	};
}
