package com.quest.day_4;

import java.util.*;

public class Pattern_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j < i; j++) {
				System.out.print("  ");
			}
			
			for(int k = num + 1 - i; k >= 1; k--) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
	}

}
