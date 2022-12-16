package com.quest.day_3;

import java.util.Scanner;

public class ReadNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ënter the number: ");
		int user = sc.nextInt();
		sc.close();
		
		while(user != 0) {
			user = sc.nextInt();
		}
	}

}
