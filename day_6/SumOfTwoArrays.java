package com.quest.day_6;

import java.util.*;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of arrays: ");
		int length = sc.nextInt();
		
		int firstArray[] = new int[length];
		int secondArray[] = new int[length];
		
		System.out.println("Enter the first array element: ");
		for(int i = 0; i < length; i++) {
			firstArray[i] = sc.nextInt();
		}
		
		System.out.println("Enter the first array element: ");
		for(int i = 0; i < length; i++) {
			secondArray[i] = sc.nextInt();
		}
		
		sc.close();
		
		int sumArray[] = new int[length];
		
		for(int i = 0; i < length; i++) {
			sumArray[i] = firstArray[i] + secondArray[i];
		}
		
		System.out.println("Sum of two arrays: ");
		for(int i : sumArray) {
			System.out.print(i + " ");
		}
	}

}
