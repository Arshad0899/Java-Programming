package com.quest.day_6;

import java.util.Scanner;

public class FibonacciSeriesUsingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no.of fibonacci numbers need: ");
		int num = sc.nextInt();
		sc.close();
		
		fibonacci(num);
	}

	static void fibonacci(int num) {
		// TODO Auto-generated method stub
		int first = 0;
		int second = 1;
		
		System.out.print(first + " " + second + " ");
		
		for(int i = 2; i < num; i++) {
			int third = first + second;
			first = second;
			second = third;
			System.out.print(third + " ");
		}
	}

}
