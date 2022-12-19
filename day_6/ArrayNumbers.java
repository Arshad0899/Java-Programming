package com.quest.day_6;

import java.util.*;

public class ArrayNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length length: ");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		
		System.out.println("Enter the array elements: ");
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
	
		sc.close();
		
		System.out.println("-------------------");
		System.out.println("The Array is: ");
		for(int i = 0; i < num; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
		System.out.println("-------------------");

	}

}
