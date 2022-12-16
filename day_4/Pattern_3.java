package com.quest.day_4;

import java.util.*;

public class Pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num + 1 - i; j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}
	}

}
