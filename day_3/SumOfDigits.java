package com.quest.day_3;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the digit: ");
		int num = sc.nextInt();
		int temp = num, total = 0;
		
		sc.close();
		
		while(temp != 0) {
			int digit = temp % 10;
			total = total + digit;
			temp = temp / 10;
		}
		
		System.out.println("Sum of all digits: " + total);
	}

}
