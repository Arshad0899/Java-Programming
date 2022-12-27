package com.quest.day_7;

import java.util.*;

public class RevenueAndTRP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no.of TV channels: ");
		int channels = sc.nextInt();
		
		double[][] revenue = new double[channels][2];
		
		System.out.println("Enter the TRP and Revenue: ");
		for(int i = 0; i < channels; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print("Enter the TRP and Revenue for " + (i + 1)  + "st chaneel: ");
				revenue[i][j] = sc.nextDouble();
			}
		}
		sc.close();
		
		
		System.out.println("---------------");
		System.out.println("TRP  \tRevenue");
		System.err.println("---  \t-------");
		for(int i = 0; i < channels; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.print(revenue[i][j] + "\t");
			}
			System.out.println("");
		}
	}

}
