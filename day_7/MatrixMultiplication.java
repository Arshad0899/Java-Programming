package com.quest.day_7;

import java.util.*;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the rows for first matrix: ");
		int rows_1 = sc.nextInt();
		
		System.out.print("Enter the columns for first matrix: ");
		int columns_1 = sc.nextInt();
		
		int[][] matrix_1 = new int[rows_1][columns_1];
		
		System.out.println("--------------------------");
		System.out.println("Enter the first matrix: ");
		for(int i = 0; i < rows_1; i++) {
			for(int j = 0; j < columns_1; j++) {
				System.out.print("Enter the [" + i + "][" + j + "] :");
				matrix_1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("--------------------------");
		System.out.println("--------------------------");		
		
		System.out.print("Enter the rows for second matrix: ");
		int rows_2 = sc.nextInt();
		
		System.out.print("Enter the columns for second matrix: ");
		int columns_2 = sc.nextInt();
		
		int[][] matrix_2 = new int[rows_2][columns_2];
		
		System.out.println("--------------------------");
		System.out.println("Enter the second matrix: ");
		for(int i = 0; i < rows_2; i++) {
			for(int j = 0; j < columns_2; j++) {
				System.out.print("Enter the [" + i + "][" + j + "] :");
				matrix_2[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("--------------------------");
		System.out.println("--------------------------");
		sc.close();
		
		
		if(columns_1 == rows_2) {
			multiplication(matrix_1, matrix_2, columns_2, rows_1, columns_1);
		} else {
			System.out.println("Can't multiply the matrix");
		}
	}

	static void multiplication(int[][] matrix_1, int[][] matrix_2, int col, int row, int column_1) {
		
		int[][] product = new int[row][col];
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				product[i][j] = 0;
				for(int k = 0; k < column_1; k++) {
					product[i][j] += matrix_1[i][k] * matrix_2[k][j];
				}
			}
		}
		
		System.out.println("Multiplication of matrix: \n");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(product[i][j] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("--------------------------");
		System.out.println("--------------------------");

	}
}
