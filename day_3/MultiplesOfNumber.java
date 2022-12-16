package com.quest.day_3;

import java.util.*;

public class MultiplesOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		
		// Looping and displaying multiples of number 10 times 
		for(int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + (i * num) );
		}
		
	}

}
