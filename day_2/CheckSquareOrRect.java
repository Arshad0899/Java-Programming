package com.quest.day_2;
import java.util.*;

public class CheckSquareOrRect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float length, breadth;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length: ");
		length = sc.nextFloat();
		System.out.println("Enter the breadth: ");
		breadth = sc.nextFloat();
		sc.close();
		
		if(length == breadth) {
			System.out.println("It's a square");
		} else {
			System.out.println("It's a rectangle");
		}

	}

}
