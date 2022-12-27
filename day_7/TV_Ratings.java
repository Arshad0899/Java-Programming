package com.quest.day_7;

import java.util.Scanner;

public class TV_Ratings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no.of TV channels: ");
		int channels = sc.nextInt();
		
		System.out.println("Enter the TV ragingss between 1 to 5: ");
		float[] rating = new float[channels];
		
		for(int i = 0; i < rating.length; i++) {
			rating[i] = sc.nextFloat();
		}
		sc.close();
		
		float maxRating = highestRating(rating);
		float minRating = lowestRating(rating);
		
		System.out.println("----------------------------");
		System.out.println("The highest TRP rating: " + maxRating);
		System.out.println("The lowest TRP rating: " + minRating);
		System.out.println("----------------------------");
	}
	
	
	// Method accepts the ratings array and return MINIMUM rating
	static float lowestRating(float[] rating) {
		
		// Initializing MINIMUM value
		float min = rating[0];
		
		// Looping through array to find MINIMUM element
		for(int i = 0; i < rating.length; i++) {
			if(rating[i] < min) {
				min = rating[i];
			}
		}
		
		return min;
	}

	
	// Method accepts the ratings array and return MAXIMUM rating
	static float highestRating(float[] rating) {
		
		// Initializing MAXIMUM value 
		float max = 0;
		
		// Looping through array to find MAXIMUM element		
		for(int i = 0; i < rating.length; i++) {
			if(rating[i] > max) {
				max = rating[i];
			}	
		}
		
		return max;
	}

}
