package com.quest.day_6;

import java.util.*;

public class FactorialUsingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		
		int factor = factorial(num);
		System.out.println("The factor of " + num + "! is " + factor);
	}

	static int factorial(int num) {
		// TODO Auto-generated method stub
		
		int fact = 1;
		
		while(num != 0) {
			fact = fact * num;
			num--;
		}
		
		return fact;
	}

}
