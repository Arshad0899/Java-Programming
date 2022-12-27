package com.quest.day_7;

import java.util.*;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the rows in the matrix: ");
		int rows = sc.nextInt();
		
		System.out.print("Enter the columns in the matrix: ");
		int columns = sc.nextInt();
		
		int[][] array = new int[rows][columns];
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print("Enter the element [" + i + "][" + j + "]: ");
				array[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		System.out.println("-------------------------");
		System.out.println("-------------------------");
		
		System.out.println("Original matrix is: ");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("-------------------------");
		System.out.println("-------------------------");
		
		int[][] transpose = new int[columns][rows];
		
		for(int i = 0; i < columns; i++) {
			for(int j = 0; j < rows; j++) {
				transpose[i][j] = array[j][i];
			}
		}
		
		System.out.println("Transpose matrix is: ");
		for(int i = 0; i < columns; i++) {
			for(int j = 0; j < rows; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("-------------------------");
		System.out.println("-------------------------");
	}

}
