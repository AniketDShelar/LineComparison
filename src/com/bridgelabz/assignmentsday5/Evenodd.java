package com.bridgelabz.assignmentsday5;
import java.util.*;

public class Evenodd {
	int n;
	Evenodd(int n){
	this.n = n;
	}
	void checkEvenOdd() {
		if(n % 2 == 0) {
			System.out.println("Even number");
		}else {
			System.out.println("Odd number");
		}
	}
	public static void main(String[] args) {
	System.out.print("Enter number = ");
	Scanner number = new Scanner(System.in);
	int n = number.nextInt();
	Evenodd result = new Evenodd(n);
	result.checkEvenOdd();
	}
}
