package com.quest.day_3;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		
		if(num <= 0) {
			System.out.println("Please input positive number");
		} else {
			System.out.println("Factors of " + num + ": ");
			for(int i = 1; i <= num; i++) {
				if(num % i == 0) {
					System.out.print(i + " ");					
				}
			}
			System.out.println(" ");
		}
	}
}
