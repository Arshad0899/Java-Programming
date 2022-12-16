package com.quest.day_2;
import java.util.*;

public class SalaryInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char gender;
		String qualifications;
		int yearsOfExp;
		int salary = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the gender (M/F): ");
		gender = sc.next().charAt(0);
		
		
		System.out.println("Enter the no.of year of service: ");
		yearsOfExp = sc.nextInt();
		
		System.out.println("Enter the qualifications(PG/Graduate): ");
		qualifications = sc.next();
		sc.close();
		
		
		if(gender == 'M') {
			if(yearsOfExp >= 10) {
				if("PG".equals(qualifications)) {
					salary = 15000;
				} else {
					salary = 10000;
				}
			} else {
				if("PG".equals(qualifications)) {
					salary = 10000;
				} else {
					salary = 8000;
				}
			}
		} else if (gender == 'F') {
			if(yearsOfExp >= 10) {
				if("PG".equals(qualifications)) {
					salary = 16000;
				} else {
					salary = 11000;
				}
			} else {
				if("PG".equals(qualifications)) {
					salary = 11000;
				} else {
					salary = 9000;
				}
			}
		} else {
			System.out.println("Please enter correct gender!");
		}
		
		System.out.println("The salary for " + gender + " with qualification in " + qualifications + " with " + yearsOfExp + " is: " + salary);
	}

}
