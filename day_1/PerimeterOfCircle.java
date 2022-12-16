package com.quest.day_1;
import java.util.Scanner;

public class PerimeterOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		final float pi = 3.1415f;
		System.out.println("Enter the radius R: ");
		int radius = sc.nextInt();
		double perimeter = 2 * pi * radius;
		sc.close();
		System.out.println("Perimeter of the circle: " + perimeter);
	}

}
