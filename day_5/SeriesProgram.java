package com.quest.day_5;

import java.util.*;

public class SeriesProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		sc.close();
		
		double result = 0;
		
		for(float i = 1; i <= num; i++) {
			float temp = i, factor = 1; 
			while(temp > 0) {
				factor = factor * temp;
				temp--;
			}
//			System.out.println(factor);
			result = result + (i/factor);
		}
		System.out.println("Result: " + result);
	}

}
