package com.quest.day_3;

import java.util.Scanner;

public class Classifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char input;
		
		System.out.println("Enter the character: ");
		input = sc.next().charAt(0);
//		x = input.toLowerCase();
		sc.close();
		
		
		if (input >= 65 && input <= 90 || input >= 97 && input <= 122) {
			System.out.println("The input is alphabet");
		} else if (input >= 48 && input <= 57) {
			System.out.println("The input is number");
		} else {
			System.out.println("The input is special character");
		}
	}
}
