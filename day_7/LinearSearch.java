package com.quest.day_7;

import java.util.*;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array length: ");
		int length = sc.nextInt();
		
		// Array to store the elements
		int[] arr = new int[length];
		
		// Accepting anď storing array elements
		System.out.println("Enter the array elements: ");
		for(int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		
		// Accepting element to search
		System.out.println("Enter the element to search: ");
		int element = sc.nextInt();
		sc.close();
		
		// Method to search the element
		linearSearch(arr, element);
	}

	static void linearSearch(int[] arr, int element) {
		
		
		boolean flag = false;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == element) {
				flag = true;
				System.out.println("Element found at position " + (i + 1));
				break;
			}
		}
		
		if(flag == false) {
			System.out.println("Element not found");
		}
		
	}
}
