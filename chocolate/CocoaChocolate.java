package com.quest.chocolate;

public class CocoaChocolate extends Chocolate implements ChocolatePrice {
	
	
	public CocoaChocolate (char size, int quantity) {
		super(size, quantity);
	}

	public void calculatePrice() {
		
		switch(getSize()) {
			case 'S':
				setPrice(60.0);
				break;
			case 'L':
				setPrice(180.0);
				break;
			case 'X':
				setPrice(400.0);
				break;
			default:
				setPrice(0);
		}
	}
	
	public void calTotalPrice() {
		double total = getPrice() * getQuantity(); 
		setTotalCost(total);
	}
	

	@Override
	public void display() {
		super.display();
		System.out.println("Total cost of Milk chocolate: " + getTotalCost());
		System.out.println("Amount to pay: " + (getTotalCost() - getDiscountPrice()));
		System.out.println("---------------------------------");
	}
}
