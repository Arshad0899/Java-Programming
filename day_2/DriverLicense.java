package com.quest.day_2;
import java.util.*;

public class DriverLicense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		char gender;
		boolean isMarried;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		age = sc.nextInt();
		
		System.out.println("Enter your gender(M/F): ");
		gender = sc.next().charAt(0);
		
		System.out.println("Are you married(true/false): ");
		isMarried = sc.nextBoolean();
		
		sc.close();
		
		if(isMarried == true) {
			
			System.out.println("Driver is insured!");
			
		} else {
			
			if(gender == 'M') {
				if(age > 30) {
					System.out.println("Driver is insured!");
				} else {
					System.out.println("Driver is not insured!");
				}
			} else if (gender == 'F') {
				if(age > 25) {
					System.out.println("Driver is insured!");
				} else {
					System.out.println("Driver is not insured!");
				}
			} else {
				System.out.println("Please input correct gender");
			}
		}
		
	}

}
