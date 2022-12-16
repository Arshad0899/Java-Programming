package com.quest.day_4;

import java.util.*;

public class Pattern_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value: ");
		int num = sc.nextInt();
		sc.close();
		
		
		System.out.println("The pattern is ");
		System.out.println("");
		
		for (int i = 1; i <= num; i++) {
			System.out.print(" ");
			for(int j = 1; j <= num - i; j++) {
				System.out.print("  ");
			}
			
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");
			}
			
			System.out.println("");
		}
	}

}
