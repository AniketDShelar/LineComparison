package com.bridgelabz.assignmentsday5;
import java.util.*;

public class Leapyear {
	int year;
	Leapyear(int year){
	this.year = year;
	}
	void checkLeapYear() {
		if (year % 2 == 0) {
			System.out.println(year+ " is a Leap Year");
		}else {
			System.out.println(year+ " is not Leap Year");
		}
	}
	public static void main(String[] args) {
	System.out.print("Enter year = ");
	Scanner sc = new Scanner(System.in);
	int year = sc.nextInt();
	Leapyear inputyear = new Leapyear(year);
	inputyear.checkLeapYear();
	}
}
