package com.quest.day_2;
import java.util.Scanner;

public class SalaryCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double basic_salary, hra, pf, sa, net_salary, gross_salary;
		System.out.print("The basic salary: ");
		basic_salary = sc.nextDouble();
		sc.close();
		hra = (basic_salary * 50) / 100;
		pf = (basic_salary * 14) / 100;
		sa = (basic_salary * 70) / 100;
		gross_salary = basic_salary + hra + sa;
		net_salary = gross_salary - pf;
		System.out.println("Net salary: " + net_salary);	
	}

}
