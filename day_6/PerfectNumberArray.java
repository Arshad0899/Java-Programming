package com.quest.day_6;

import java.util.*;

public class PerfectNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		int counter = 0;
		
		while(arr[4] == 0) {
			System.out.println("Enter the number: ");
			int num = sc.nextInt();
			int sum = 0;
			for(int i = 1; i <= num/2; i++) {
				if(num % i == 0) {
					sum = sum + i;
				}
			}
			
//			System.out.println(counter + " : " + num);
			if(num == sum) {
				arr[counter] = num;
				counter++;
			}
		}
		
		System.out.println("The array of first 5 perfect numbers: ");
		for(int i : arr) {
			System.out.print(i + "\t");
		}
		
		sc.close();
	}

}
