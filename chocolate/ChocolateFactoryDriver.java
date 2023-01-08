package com.quest.chocolate;

import java.util.Scanner;

public class ChocolateFactoryDriver {

	public static void main(String[] args) {

		System.out.println("Welcome to Chocolate Factory \n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of milk chololate: ");
		String milkSize = sc.next();
		milkSize = milkSize.toUpperCase();
		char ms = milkSize.charAt(0);
		
		System.out.print("Enter the qunatity of milk chocolates: ");
		int milkQuantity = sc.nextInt();
		
		MilkChocolate mc = new MilkChocolate(ms, milkQuantity);
		
		mc.calculatePrice();
		mc.calTotalPrice();
		mc.calDiscountPrice();
		mc.display();
		
		System.out.println("--------------------------------");
		
		System.out.print("Enter the size of cocoa chololate: ");
		String cocoaSize = sc.next();
		cocoaSize = cocoaSize.toUpperCase();
		char cs = cocoaSize.charAt(0);
		
		System.out.print("Enter the qunatity of milk chocolates: ");
		int cocoaQuantity = sc.nextInt();
		
		CocoaChocolate cc = new CocoaChocolate(cs, cocoaQuantity);
		
		cc.calculatePrice();
		cc.calTotalPrice();
		cc.calDiscountPrice();
		cc.display();
		System.out.println("--------------------------------");	
		
		sc.close();

	}

}
