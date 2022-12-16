package com.quest.day_2;

import java.util.*;

public class GreatestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, greatest;
		System.out.println("Enter 1st number: ");
		num1 = sc.nextInt();
		System.out.println("Enter 2st number: ");
		num2 = sc.nextInt();
		System.out.println("Enter 3rd number: ");
		num3 = sc.nextInt();
		sc.close();
		
		if(num1 > num2) {
			if(num1 > num3) {
				greatest = num1;
			} else {
				greatest = num3;
			}
		} else {
			if(num2 > num3) {
				greatest = num2;
			} else {
				greatest = num3;
			}
		}
		System.out.println("Greatest number is: " + greatest);
	}

}
