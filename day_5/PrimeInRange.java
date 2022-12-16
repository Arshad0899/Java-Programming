package com.quest.day_5;

import java.util.*;

public class PrimeInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Accepting the minimum number from user
		System.out.println("Enter the minimum number: ");
		int min = sc.nextInt();
		
		// Accepting the maximum number from user
		System.out.println("Enter the maximum number: ");
		int max = sc.nextInt();
		
		// Initializing boolean value
		boolean isPrime = true;
		sc.close();
		
		// Looping through min to max
		for(int i = min; i <= max; i++) {
			
			// checking for prime number
			for(int j = 2; j < i/2; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				} else {
					isPrime = true;
				}
			
			}
			
			// Printing if it is prime
			if(isPrime == true) {
				System.out.print(i + " ");
			}
				
		}
	}

}
