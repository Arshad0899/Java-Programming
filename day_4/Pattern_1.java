package com.quest.day_4;

import java.util.*;

public class Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no.of lines need: ");
		int num = sc.nextInt();
		
		sc.close();
		
		System.out.println("The pattern is ");
		
		// 
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		
	}

}
