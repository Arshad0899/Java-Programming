package com.quest.day_9;

import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter the second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter the operation to perform: ");
		System.out.println("1. Addition - '+'\n2. Subtraction - '-'\n3. Multiplication - '*'\n4. Division - '\'\n5. Modulo - '%'\n");
		System.out.print("Choose the option: ");
		char operation = sc.next().charAt(0);
		sc.close();
				
		Number cal1 = new Number(num1);
		Number cal2 = new Number(num2);
		
		
		System.out.println("---------------------------");
		
		switch(operation){
		
			case '+' : {
				Number cal = cal1.add(cal2);
				System.out.println("The addition of " + cal1.getNum() + " and " + cal2.getNum() + " is: " + cal.getResult());
				break;
			}			
			
			case '-' : {
				Number cal = cal1.subtract(cal2);
				System.out.println("The subtraction of " + cal1.getNum() + " and " + cal2.getNum() + " is: " + cal.getResult());
				break;
			}
			
			case '*' : {
				Number cal = cal1.multiply(cal2);
				System.out.println("The multiplication of " + cal1.getNum() + " and " + cal2.getNum() + " is: " + cal.getResult());
				break;
			}
			
			case '/' : {
				Number cal = cal1.division(cal2);
				System.out.println("The division of " + cal1.getNum() + " and " + cal2.getNum() + " is: " + cal.getResult());
				break;
			}
			
			case '%' : {
				Number cal = cal1.modulo(cal2);
				System.out.println("The  modulo of " + cal1.getNum() + " and " + cal2.getNum() + " is: " + cal.getResult());
				break;
			}
			
			default : {
				System.out.println("Enter valid operator!!");
			}
		}
		
		System.out.println("---------------------------");
//		System.out.println("first number: " + cal1.getNum1());
//		System.out.println("second number: " + cal1.getNum2());		
	}
	
}
