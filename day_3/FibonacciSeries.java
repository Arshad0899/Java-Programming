package com.quest.day_3;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of fibonacci numbers requried: ");
		int range = sc.nextInt();
		
		sc.close();
		
		int n1 = 0;
		int n2 = 1;
		
		System.out.print(n1 + " " + n2 + " ");
		
		for(int i = 0; i < range-2; i++) {
			int n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
		}
		
	}

}
