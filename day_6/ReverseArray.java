package com.quest.day_6;

import java.util.*;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of array: ");
		int length = sc.nextInt();
		
		int[] arr = new int[length];
		
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int rev[] = new int[length];

		int index = 0;
		
		System.out.println("The reverse of the array: ");
		for(int i = length - 1; i >= 0; i--) {
			rev[index] = arr[i];
			index++;
		}
		
		for(int i : rev) {
			System.out.print(i + " ");
		}
	}

}
