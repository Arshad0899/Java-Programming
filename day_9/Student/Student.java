package com.quest.day_9;

public class Student {
	
		// Properties -->
		private int rollNo;
		private String name;
		private String schoolName;
		private int age;
		private double score;
		
		
		// Constructor -->
		public Student (int rollNo, String name, String schoolName, int age, double score) {
			this.rollNo = rollNo;
			this.name = name;
			this.schoolName = schoolName;
			this.age = age;
			this.score = score;
		}

		
		// getters and Setter -->
		public int getRollNo() {
			return rollNo;
		}

		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSchoolName() {
			return schoolName;
		}

		public void setSchoolName(String schoolName) {
			this.schoolName = schoolName;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public double getScore() {
			return score;
		}

		public void setScore(double score) {
			this.score = score;
		}
		
		// Dispaly method -->
		public void displayInfo() {
			System.out.println("Roll No : " + this.rollNo);
			System.out.println("Name : " + this.name);
			System.out.println("Age : " + this.age);
			System.out.println("School Name : " + this.schoolName);
			System.out.println("Score : " + this.score);
		}
		
	}


