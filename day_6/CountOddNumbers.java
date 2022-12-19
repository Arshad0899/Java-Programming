package com.quest.day_6;

import java.util.*;

public class CountOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of the array: ");
		int num = sc.nextInt();
		int arr[] = new int[num];
		
		// Stroing the array elements
		System.out.println("Enter the array elements");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		// Checking and counting for odd numbers
		int count = 0;
		for(int i : arr) {
			if(i % 2 != 0) {
				count++;
			}
		}
		
		System.out.println("The number of odd elements in the array is: " + count);
	}

}
