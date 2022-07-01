package com.bridgelabz.employeewage;

public class Empwage {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int wageperhour = 20;

	public static void main(String[] args) {
		int emphrs = 0;
		int empwage = 0;
		double empcheck = Math.floor(Math.random() * 10) % 3;
		if (empcheck == IS_FULL_TIME) {
			emphrs = 8;
			System.out.println("Employee is present as full time");
		} else if (empcheck == IS_PART_TIME) {
			emphrs = 4;
			System.out.println("Employee is present as part time");
		} else {
			emphrs = 0;
			System.out.println("Employee is absent");
		}
		  empwage = emphrs * wageperhour;
		  System.out.println("Employee wage is = "+empwage);
	}
}