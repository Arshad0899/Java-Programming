package com.quest.day_7;

import java.util.*;

public class RowaAndColumns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		
		System.out.println("Enter the number of columns: ");
		int columns = sc.nextInt();
		
		int[][] array = new int[rows][columns];
		
		
		System.out.println("Enter the array elements: ");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print("Enter element [" + i + "][" + j + "]: ");
				array[i][j] = sc.nextInt();
			}
		}

		
		System.out.println("---------------------------");
		System.out.println("The array elements are: ");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("---------------------------");
		sc.close();
	}

}
