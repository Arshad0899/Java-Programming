package com.quest.day_3;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sc.close();

		boolean isPrime = true;
		
		for(int i = 2; i <= num/2; i++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			} else {
				isPrime = true;
			}
			
		}
			
		if(isPrime == true) {
				System.out.print(num + " ");
		} 
	}		
}