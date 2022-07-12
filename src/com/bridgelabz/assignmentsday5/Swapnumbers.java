package com.bridgelabz.assignmentsday5;

public class Swapnumbers {
	public static void main(String[] args) {
		int firstnumber = 25;
		int secondnumber = 35;
		System.out.println("---Before Swapping---");
		System.out.println("First number = " +firstnumber);
		System.out.println("Second number = " +secondnumber);
		
		int temporarynumber = firstnumber;
		firstnumber = secondnumber;
		secondnumber = temporarynumber;
		System.out.println("---After Swapping---");
		System.out.println("First number = " +firstnumber);
		System.out.println("Second number = " +secondnumber);
	}
}
