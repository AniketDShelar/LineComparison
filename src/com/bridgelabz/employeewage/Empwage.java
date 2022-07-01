package com.bridgelabz.employeewage;

public class Empwage {
	public static void main(String[] args) {
		int IS_PRESENT = 1;
		int wageperhour = 20;
		int totalworkinghrs = 8;
		int empwage;
	    double empcheck = Math.floor(Math.random() * 10) % 2;
		if (empcheck == IS_PRESENT) {
			System.out.println("Employee is present");
			empwage = wageperhour * totalworkinghrs;
			System.out.println("Employee wage = " +empwage);
	    }else {
	    	System.out.println("Employee is absent");
	    }
	}
}
