package com.quest.day_4;

import java.util.*;

public class Pattern_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		
		char ch = 'A';
		
		System.out.println("The pattern is: \n");
		for(int i = 1; i <= num; i++) {
			System.out.print(" ");
			for(int j = num - 1; j >= i; j--) {
				System.out.print("  ");
			}
			
			for(int k = 1; k <= i; k+=2) {
				System.out.print(ch + "   ");
				ch++;
			}
			
			for(int l = 1; l < i; l+=2) {
				System.out.print(ch + "   ");
				ch++;
			}
			System.out.println("");
		}
	}

}
