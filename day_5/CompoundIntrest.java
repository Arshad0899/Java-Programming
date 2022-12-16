package com.quest.day_5;

import java.util.Scanner;

public class CompoundIntrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int principal, noOfPeriod,time;
		float rateOfInterest;
		double amount;
		
		System.out.print("Enter the principal amount(P): ");
		principal = sc.nextInt();
		System.out.print("Enter the Intrest rate(R): ");
		rateOfInterest = sc.nextFloat();
		System.out.print("Enter the time period(T): ");
		time = sc.nextInt();
		System.out.print("Enter the number of compounding periods per unit of time(N): ");
		noOfPeriod = sc.nextInt();
		sc.close();
		
		System.out.println("---------------------------------------------------------");
		
		// Convert rate of interest from percentage to fraction
		float r = rateOfInterest / 100;

		// Calculate the compound interest
		int pow = time * noOfPeriod;
		float result = ( 1 + (r / noOfPeriod));
		float temp = (float) Math.pow(result, pow);
		amount = temp * principal;
		
		System.out.println("The compound interest is: " + String.format("%.2f",amount));
		System.out.println("The interest: " + String.format("%.2f",(amount - principal)));
//		System.out.println("Every month: " + (amount - principal) / (12*5));
	}

}
