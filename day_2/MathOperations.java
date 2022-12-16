package com.quest.day_2;
import java.util.Scanner;

public class MathOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating new Scanner object
		Scanner sc = new Scanner(System.in);
		int num1, num2, result = 0; 
		char symbol;
		
		// Reading num1
		System.out.println("Enter the first number: ");
		num1 = sc.nextInt();
		
		// Reading num2
		System.out.println("Enter the second number: ");
		num2 = sc.nextInt();
		
		// Reading symbol
		System.out.println("Enter the symbol to perform operation: ");
		symbol = sc.next().charAt(0);
		
		// closing scanner object
		sc.close();
		 
		if(symbol == '+') {
			result = num1 + num2;
		} else if(symbol == '-') {
			if(num1 > num2) {
				result = num1 - num2;				
			} else {
				System.out.println("num1 lesser than num2");
			}
		} else if(symbol == '*') {
			result = num1 * num2;
		} else if(symbol == '/') {
			if(num2 != 0) {
				result = num1 / num2;				
			} else {
				System.out.println("num2 is zero. Please change it");
				result = 0;
			}
		} else if(symbol == '%') {
			if(num2 != 0) {
				result = num1 % num2;				
			} else {
				System.out.println("num2 is zero. Please change it");
				result = 0;
			}
		}else {
			System.out.println("Please check the symbol");
		}
		
		// Display result
		System.out.println("Result is " + result);
	}

}
