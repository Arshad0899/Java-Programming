package com.quest.day_6;

import java.util.*;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Users enters the length of array
		System.out.println("Enter the array length: ");
		int num = sc.nextInt();
		int orgArray[] = new int[num];
		
		int length = orgArray.length;
		
		// Stores the array elements
		System.out.println("Enter the array elements: ");
		for(int i = 0; i < length; i++) {
			orgArray[i] = sc.nextInt();
		}
		sc.close();
		
		// Function to duplicate the array 
		// two arguments length of array and original array
		int dupArray[] = duplicateArray(length, orgArray);
		
		
		// Displays Original Array
		System.out.println("--------------------");
		
		System.out.println("The original Array: ");
		for(int i : orgArray) {
			System.out.print(i + "\t");
		}
		
		System.out.println("--------------------");
		
		// Displays Duplicate array from function
		System.out.println("The duplicate array: ");
		
		for(int i : dupArray) {
			System.out.print(i + "\t");
		}
		
		System.out.println("--------------------");
	}

	
	static int[] duplicateArray(int n, int[] arr) {
		
		// New array too store the elements from original array
		int dupArray[] = new int[n];
		
		// Copies elements from original array to duplicate array
		for(int i = 0; i < n; i++) {
			dupArray[i] = arr[i];
		}
		
		// Adds 5 to every element in duplicate array only
		for(int i = 0; i < n; i++) {
			dupArray[i] += 5;
		}
		
		// returns the duplicate array
		return dupArray;
	}

}
