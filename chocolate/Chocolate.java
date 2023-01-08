package com.quest.chocolate;

abstract class Chocolate {
	
	private char size;
	private double price;
	private int quantity;
	private double totalCost;
	private double discountPrice; 
	
	// Constructors -->
	public Chocolate(char size, int quantity) {
		this.size = size;
		this.quantity = quantity;
	}
	
	public Chocolate() {
		
	}
	
	// Getters and Setters -->
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public char getSize() {
		return size;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}
	
	public double getDiscountPrice() {
		return this.discountPrice;
	}
	
	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	
	
	// Methods -->
	public void display() {
		System.out.println("---------------------------------");
		System.out.println("Size: " + this.size);
		System.out.println("Quantity: " + this.quantity);
		System.out.println("Each chocolate price: " + this.price);
		System.out.println("Discount price: " + this.discountPrice);
	}
	
	public void calDiscountPrice() {
//		calTotalPrice();
		if(getQuantity() <= 50) {
			setDiscountPrice(totalCost * 0.10);
		} else if(getQuantity() <= 100) {
			setDiscountPrice(totalCost * 0.15);
		} else if(getQuantity() <= 150) {
			setDiscountPrice(totalCost * 0.20);
		} else if(getQuantity() > 150) {
			setDiscountPrice(totalCost * 0.30);
		} else {
			setDiscountPrice(0);
		}
	}
	
	// Abstract method -->
	abstract void calTotalPrice();
	

}
