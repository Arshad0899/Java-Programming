package com.quest.day_1;
import java.util.Scanner;

public class SumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value: ");
		int n = sc.nextInt();
		int sum = 0, avg; 
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter the " + i + "th value: ");
			int num = sc.nextInt();
			sum = sum + num;
		}
		sc.close();
		System.out.println("The sum of " + n + " values: " + sum);
		avg = sum / n;
		System.out.println("Average: " + avg);
	}

}
