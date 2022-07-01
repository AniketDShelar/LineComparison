package com.bridgelabz.employeewage;

public class Empwage {
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int wageperhour = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static void main(String[] args) {
		int emphrs = 0, empwage=0, totalempwage = 0;
		for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
		int empcheck = (int)Math.floor(Math.random() * 10) % 3;
		switch (empcheck) {
		case IS_FULL_TIME:
		emphrs = 8;
		break;
		case IS_PART_TIME:
			emphrs = 4;
			break;
		default:
		emphrs = 0;
		}
		  empwage = emphrs * wageperhour;
		  totalempwage += empwage;
		  System.out.println("day "+day+"Employeewage = "+empwage);
		}
			System.out.println("Total Employee wage = "+totalempwage);
    }
}