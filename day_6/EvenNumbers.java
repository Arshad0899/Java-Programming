package com.quest.day_6;

import java.util.*;

public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of array: ");
		int num = sc.nextInt();
		
		// Array for even numbers
		int evenArray[] = new int[num];
		
		// Array for odd numbers
		int oddArray[] = new int[num];
		
		// Storing Even Numbers
		int evenIndex = 0; 
		for(int i = 2; i <= num * 2; i += 2) {
			evenArray[evenIndex] = i;
			evenIndex++;
		}
		
		//Stroing Odd numbers
		int oddIndex = 0;
		for(int i = 1; i <= num * 2; i += 2) {
			oddArray[oddIndex] = i;
			oddIndex++;
		}
		
		sc.close();
		
		// Displaying even numbers array
		System.out.println("The even numbers array is: ");
		for(int i : evenArray) {
			System.out.print(i + "\t");
		}

		System.out.println("");
		System.out.println("---------------------------");
		
		// Displaying odd numbers array
		System.out.println("The odd numbers array is: ");
		for(int i : oddArray) {
			System.out.print(i + "\t");
		}
		
	}

}
