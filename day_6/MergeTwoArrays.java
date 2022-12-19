package com.quest.day_6;

import java.util.*;

public class MergeTwoArrays {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of first array: ");
		int firstLength = sc.nextInt();
		
		System.out.println("Enter the length of second array: ");
		int secondLength = sc.nextInt();
		
		int firstArray[] = new int[firstLength];
		int secondArray[] = new int[secondLength];
		
		System.out.println("Enter the elements of first array: ");
		for(int i = 0; i < firstLength; i++) {
			firstArray[i] = sc.nextInt();
		}
		
		System.out.println("Enter the elements of second array: ");
		for(int i = 0; i < secondLength; i++) {
			secondArray[i] = sc.nextInt();
		}
		
		sc.close();
		
		mergeArrays(firstArray, secondArray);
	}

	static void mergeArrays(int[] firstArray, int[] secondArray) {
		// TODO Auto-generated method stub
		int thirdLength = firstArray.length + secondArray.length;
		
		int thirdArray[] = new int[thirdLength];
		int index = 0;
		
		for(int i = 0; i < firstArray.length; i++) {
			thirdArray[index] = firstArray[i];
			index++;
		}
		
		for(int i = 0; i < secondArray.length; i++) {
			thirdArray[index] = secondArray[i];
			index++;
		}
		
		System.out.println("The third array elements are: ");
		for(int i : thirdArray) {
			System.out.print(i + "\t");
		}
	}

}
