package com.bridgelabz.employeewage;

public class Empwage{

	public static void main(String[] args) {
		int IS_PRESENT = 1;
		double empcheck = Math.floor(Math.random()*10)%2;
		
		if (empcheck == IS_PRESENT) {
			System.out.println("Employee is present");
		}else{
			System.out.println("Employee is absent");	
		}
	}
}