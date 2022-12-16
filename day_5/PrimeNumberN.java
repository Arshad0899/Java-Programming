package com.quest.day_5;

import java.util.*;

public class PrimeNumberN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the N value: ");
		int num = sc.nextInt();
		sc.close();
		
		boolean isPrime = true;
		
		for(int i = 2; i <= num; i++) {
		
				for(int j = 2; j <= i/2; j++) {
					if(i % j == 0) {
						isPrime = false;
						break;
					} else {
						isPrime = true;
					}
					
				}
			
			if(isPrime) {
				System.out.print(i + " ");
			} 
		}

	}

}