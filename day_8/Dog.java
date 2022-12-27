package com.quest.day_8;

public class Dog {

	// Properties -->
	
	private String name;
	private int age;
	private String color;
	private double weight;
	private String breed;
	
	
	// Getter and Setters -->
	
	public double getWeight() {
		return weight;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int a) {
		age = a;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setColor(String col) {
		color = col;
	}
	
	public void setWeight(double wt) {
		weight = wt;
	}
	
	public void setBreed(String b) {
		breed = b;
	}
	
	
	// Method -->
	public void eat() {
		System.out.println("Dog is eating ");
	}
	
	public void barks() {
		System.out.println("The dog barks at strangers");
	}
	
	public void run() {
		System.out.println("The dog runs fast");
	}
	
	public void sleep() {
		System.out.println("The dog sleeps on the road");
	}
	
}



