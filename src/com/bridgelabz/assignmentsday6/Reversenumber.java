package com.bridgelabz.assignmentsday6;
import java.util.*;

public class Reversenumber {
	public static void main(String[] args) {
	int reverse = 0;
	System.out.print("Enter number to reverse = ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	for (;n != 0;) {
		int remainder = n % 10;
		reverse = reverse * 10 + remainder;
		n = n / 10;
	   }
		System.out.println("Reversed number is = "+reverse);
	}
}


