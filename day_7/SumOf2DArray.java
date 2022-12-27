package com.quest.day_7;

import java.util.*;

public class SumOf2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the rows and columns for n x n matrix: ");
		int num = sc.nextInt();
		
		int[][] array = new int[num][num];
		
		System.out.println("Enter the array elements (" + num + " x " + num + " matrix: ");
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < num; j++) {
				System.out.print("Enter element [" + i + "][" + j + "]: ");
				array[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		System.out.println("-------------------------------------");
		int result = sum(array, num);
		System.out.println("Sum of the elements of array: " + result);
		System.out.println("-------------------------------------");
	}

	static int sum(int[][] array, int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				sum += array[i][j];
			}
		}
		return sum;
	}

}
