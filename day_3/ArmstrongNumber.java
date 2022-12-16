package com.quest.day_3;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		int temp = num, arm = num, length = 0; 
		double total = 0;
		
		sc.close();
		
		// Length of the given number
		while(temp != 0) {
			temp = temp / 10;
			length++;
		}
		
		// Checking Armstrong
		for(int i = 0; i < length; i++) {
			int digit = arm % 10;
			total = total + Math.pow(digit, length);
			arm = arm / 10;
		}
		
		if(num == total) {
			System.out.println("The number is Armstrong");
		} else {
			System.out.println("The number is not Armstrong");
		}
	}

}
