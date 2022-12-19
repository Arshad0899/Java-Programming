package com.quest.day_6;

import java.util.*;

public class SumOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ente the array length: ");
		int num = sc.nextInt();
		
		int arr[] = new int[num];
		int sum = 0;
		
		System.out.println("Enter the array elements: ");
		for(int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		
		System.out.println("-------------------------");
		System.out.print("Sum of array elements: ");
		
//		for(int i = 0; i < num; i++) {
//			sum = sum + arr[i];
//		}
//		
		for(int i : arr) {
			sum = sum + i;
		}
		
		System.out.print(sum);
		System.out.println("-------------------------");

	}

}
