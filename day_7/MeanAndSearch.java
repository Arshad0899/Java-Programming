package com.quest.day_7;

import java.util.*;

public class MeanAndSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Accepting the length of the array
		System.out.println("Enter the number of elements in array: ");
		int length = sc.nextInt();
		double array[] = new double[length]; 
		
		// Accepting and stroing the elements in array
		System.out.println("Enter the array elements: ");
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextDouble();
		}
		
		// calcuates the mean value
		double meanValue = mean(array);
		System.out.println(meanValue);
		
		// Accepts the element to be found
		System.out.println("Enter the element to find in array: ");
		double element = sc.nextDouble();
		sc.close();
		
		// Finds the element from array
		int index = search(array, element);
		
		// Prints the position if found 
		if(index == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("The position of element in array is " + (index + 1));			
		}
	}

	
	static int search(double[] array, double element) {
		
		// loops through the array to find the element
		for(int i = 0; i < array.length; i++) {
			
			if(element == array[i]) {
				// return the index if found
				return i;
			}
		}
		
		// returns -1 if element not found
		return -1;
		
	}
	

	static double mean(double[] array) {

		double sum = 0;
		
		// Adds every element to the sum
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		// Divides total elemets in the array to find mean
		double mean = sum / array.length;
		return mean;
	}

}
