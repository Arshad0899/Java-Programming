package com.quest.day_1;
import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length, breath;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of rectangle: ");
		length = sc.nextInt();
		System.out.println("Enter the breath of rectangle: ");
		breath = sc.nextInt();
		sc.close();
		int area = length * breath;
		System.out.println("Area of rectangle is: " + area);
	}

}
