package com.quest.day_3;

import java.util.*;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to reverse: ");
		long num = sc.nextLong();
		long temp = num, n = num, length = 0, rev = 0;
		sc.close();
		
		// Length of given number
		while(temp != 0) {
			temp = temp / 10;
			length++;
		}
		
		// 
		int multiplier = (int) Math.pow(10, length-1);
		
		// Reversing the given number
		for(int i = 0; i < length; i++) {
			long digit = n % 10;
			
			// 1234 => 4000 + 200 + 30 + 4 => 4321
			rev = rev + (digit * multiplier);
			n = n / 10;
			multiplier = multiplier / 10;
		}
		
		// Displaying the reverse number
		System.out.println("Reverse number is: " + rev);
		
		// Checking for palindrome
		if(num == rev) {
			System.out.println("It's a palindrome");
		} else {
			System.out.println("It's not a palindrome");
		}
	}
}
