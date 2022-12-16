package com.quest.day_5;

public class LevelOfIntelligence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double i = 0.00;
		
		System.out.println("  i     y     x");
		System.out.println("-----------------");
		for(int y = 1; y <= 6; y++) {
			for(double x = 5.5; x <= 12.5; x += 0.5) {
				i = 2 + (y + (0.5 * x));
				System.out.print(i + "    ");
				System.out.print(y + "    ");
				System.out.print(x + "    ");
				System.out.println("");
			}
		}
		
	}

}
