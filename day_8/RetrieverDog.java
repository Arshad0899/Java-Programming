package com.quest.day_8;

public class RetrieverDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog1 = new Dog();
		
		dog1.setName("Max");
		dog1.setAge(10);
		dog1.setColor("Golden brown");
		dog1.setBreed("Golden Retriever");
		dog1.setWeight(30.2);
		
		System.out.println("Name:   " + dog1.getName());
		System.out.println("Breed:  " + dog1.getBreed());
		System.out.println("Age:    " + dog1.getAge());
		System.out.println("Color:  " + dog1.getColor());
		System.out.println("Weight: " + dog1.getWeight());
		
		System.out.println("");
		System.out.println("------------------");
		System.out.println("");
		
		dog1.barks();
		dog1.eat();
		dog1.sleep();
		dog1.run();

	}

}
