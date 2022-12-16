package com.quest.day_3;

import java.util.*;

public class NoOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the digit: ");
		long num = sc.nextLong();
		
		long n = num;
		int counter = 0;
		
		sc.close();
		
		while(n != 0) {
			n = n / 10;
			counter++;
		}
		
		System.out.println("No. of digits in " + num + " is " + counter);
	}

}
