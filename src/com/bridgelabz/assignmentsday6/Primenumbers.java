package com.bridgelabz.assignmentsday6;
import java.util.*;

public class Primenumbers {
	public static void main(String[] args) {
	System.out.print("Enter Number = ");
	boolean result = false;
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	for (int i = 2; i < n; i++) {
		if(n % i == 0) {
			result = true;
			break;
		}
	}
		if(!result) {
			System.out.println(n+ " is a Prime Number");
		}
		else {
			System.out.println(n+ " is not Prime Number");
		}
	}
}
