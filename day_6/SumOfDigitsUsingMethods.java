package com.quest.day_6;

import java.util.*;

public class SumOfDigitsUsingMethods {

	static int sumOfNumber(int n) {
		int result = 0;
		int temp = n;
		while(temp != 0) {
			int digit = temp % 10;
			result = result + digit;
			temp = temp / 10;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		
		int sum = sumOfNumber(num);
		System.out.println("The sum of all digits in " + num + " is: " + sum);
//		System.out.println(res);
	}

}
