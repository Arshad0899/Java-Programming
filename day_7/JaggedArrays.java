package com.quest.day_7;

import java.util.*;

public class JaggedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		sc.close();
		
		char[][] patternArray = new char[rows][];
		
		for(int i = 0; i < rows; i++) {
			patternArray[i] = new char[i + 1];
		}
		
		char ch = 65;
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < patternArray[i].length; j++) {
				patternArray[i][j] = ch;
				ch++;
			}
		}
		
		System.out.println("The pattern is: ");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < patternArray[i].length; j++) {
				System.out.print(patternArray[i][j] + "\t");	
			}
			System.out.println("");
		}
		
	}

}
