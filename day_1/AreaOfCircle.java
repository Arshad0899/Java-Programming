package com.quest.day_1;
import java.util.Scanner;

public class AreaOfCircle {
	
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
	  final float pi = 3.1415f;
	  System.out.println("Enter the radius of circle: ");
	  int radius = sc.nextInt();
	  float area = pi * radius * radius;
	  System.out.println("Area of circle: " + area);
	  sc.close();
    }

}
