package com.quest.day_6;

import java.util.*;

public class ReverseNumberUsingMethods {
	
	static void reverse(int num) {
		
		int temp = num, length = 0, n = num, rev = 0;
		
		// Getting length of number
		while(temp != 0) {
			temp = temp / 10;
			length++;
		}
		
		int multiplier = (int) Math.pow(10, length-1);
		
		// Reversing the given number
		for(int i = 0; i < length; i++) {
			int digit = n % 10;
			
			// 1234 => 4000 + 200 + 30 + 4 => 4321
			rev = rev + (digit * multiplier);
			n = n / 10;
			multiplier = multiplier / 10;
		}
		
		System.out.println("Reverse number is: " + rev);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Accepting number from user
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		
		reverse(num);	
//		reverse(34543);
	}

}
