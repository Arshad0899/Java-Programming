package com.quest.day_3;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		
		int temp = num; 
		long fact = 1;
		
		while(temp > 0) {
			fact = fact * temp;
			temp--;
		}
		
		System.out.println("Factorial of " + num + " is: "+ fact);

	}

}
