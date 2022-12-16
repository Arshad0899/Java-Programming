package com.quest.day_4;

import java.util.*;

public class Pattern_8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		
		System.out.println("The pattern is: \n");
		
		// Upper pyramid
		for(int i = 1; i <= num; i++) {
			System.out.print(" ");
			
			// Print left spaces
			for(int j = num-1; j >= i; j--) {
				System.out.print("  ");
			}
			
			// Print upper left half triangle
			for(int k = 1; k <= i; k+=2) {
				System.out.print("*   ");
			}
			
			// Print upper right half triangle
			for(int l = 1; l < i; l+=2) {
				System.out.print("*   ");
			}
			
			System.out.println(" ");
		}
			
			
		// Lower pyramid
		for(int x = 1; x <= num - 1; x++) {
			System.out.print(" ");
			
			// Print left spaces
			for(int j = 1; j <= x; j++) {
				System.out.print("  ");
			}
			
			// Print lower left half triangle
			for(int k = num - 1; k >= x; k -= 2) {
				System.out.print("*   ");
			}
			
			// Print lower right half triangle 
			for(int l = num - 2; l >= x; l -= 2) {
				System.out.print("*   ");
			}
			System.out.println("");
		
		}

	}
}
