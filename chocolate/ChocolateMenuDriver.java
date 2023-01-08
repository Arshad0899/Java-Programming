package com.quest.chocolate;
import java.util.*;

public class ChocolateMenuDriver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Chocolate factory\n");
		
		int type; 
		int milkCount = 0;
		int cocoaCount = 0;
		MilkChocolate[] milk = new MilkChocolate[10];
		CocoaChocolate[] cocoa = new CocoaChocolate[10];
		
		do {
			System.out.println("Select type of chocolate: \n  1. Milk\n  2. Cocoa\n  3. Exit");
			System.out.print("Enter the option: ");
			type = sc.nextInt();
			
			switch(type) {
				case 1:
					System.out.print("Enter size: ");
					String milkSize = sc.next();
					milkSize = milkSize.toUpperCase();
					char s = milkSize.charAt(0);
					
					System.out.print("Enter quantity: ");
					int milkQuantity = sc.nextInt();
					
					milk[milkCount] = new MilkChocolate(s, milkQuantity);
					
					milk[milkCount].calculatePrice();
					milk[milkCount].calTotalPrice();
					milk[milkCount].calDiscountPrice();
					milk[milkCount].display();
					milkCount++;
					break;
					
				case 2:
					System.out.print("Enter size: ");
					String cocoaSize = sc.next();
					cocoaSize = cocoaSize.toUpperCase();
					char s1 = cocoaSize.charAt(0);
					
					System.out.print("Enter quantity: ");
					int cocoaQuantity = sc.nextInt();
					
					cocoa[cocoaCount] = new CocoaChocolate(s1, cocoaQuantity);
					
					cocoa[cocoaCount].calculatePrice();
					cocoa[cocoaCount].calTotalPrice();
					cocoa[cocoaCount].calDiscountPrice();
					cocoa[cocoaCount].display();
					cocoaCount++;
					break;
					
				case 3:
					System.out.println("--- Thank you ---");
					break;
				
				default:
					System.out.println("----------------------");
					System.out.println("Enter correct choice!");
					System.out.println("----------------------");
			}
		}while(type != 3);
		
		sc.close();

	}

}
