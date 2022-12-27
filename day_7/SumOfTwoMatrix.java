package com.quest.day_7;

import java.util.*;

public class SumOfTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the rows in matrix: ");
		int rows = sc.nextInt();

		System.out.println("Enter the columns in matrix: ");
		int columns = sc.nextInt();
		
		int[][] matrix_1 = new int[rows][columns];
		int[][] matrix_2 = new int[rows][columns];
		
		System.out.println("Enter the first matrix: ");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print("Enter element [" + i + "][" + j + "]: ");
				matrix_1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("-------------------------");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print("Enter element [" + i + "][" + j + "]: ");
				matrix_2[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		
		System.out.println("-------------------------");
		
		int[][] sumMatrix = sum(matrix_1, matrix_2, rows, columns);
		
		System.out.println("The sum of 1st martix and 2nd matrix is: ");
		System.out.println("");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print(sumMatrix[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("-------------------------");		

	}

	
	static int[][] sum(int[][] matrix_1, int[][] matrix_2, int row, int col) {
		
		int[][] sumArray = new int[row][col];
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				sumArray[i][j] = matrix_1[i][j] + matrix_2[i][j];
			}
		}
		
		return sumArray;
	}

}
