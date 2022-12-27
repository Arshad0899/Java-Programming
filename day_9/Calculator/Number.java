package com.quest.day_9;

public class Number {
	
	private int num1;
	private int num2;
	private int result;
	
	// Constructor -->
	public Number(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	// Getters and Setter for num1 and num2 --> 
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}


	// methods -->
	public void add() {
		result = num1 + num2;
	}
	
	public void subtract() {
		result = num1 - num2;
	}
	
	public void multiply() {
		result = num1 * num2;
	}
	
	public void division() {
		if(num2 != 0) {
			result = num1 / num2;
		}
		else {
			result = 0;
			System.out.println("Invalid!");			
		}
	}
	
	public void modulo() {
		if(num2 != 0) {
			result = num1 % num2;
		}
		else {
			result = 0;
			System.out.println("Invalid!");			
		}
	}

	// Getters for result -->
	public int getResult() {
		return result;
	}


}
