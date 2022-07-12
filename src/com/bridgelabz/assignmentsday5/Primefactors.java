package com.bridgelabz.assignmentsday5;
import java.util.*;

public class Primefactors {
	int n;
	Primefactors(int n){
	this.n = n;
	}
	void getPrimeFactors() {
		while(n % 2 == 0) {
			System.out.print(2+ "*");
			n = n / 2;
		}
		for (int i = 3; i <= Math.sqrt(n); i+=2) {
			while (n % i == 0) {
				System.out.print(i+ "*");
				n = n  / i;
			}
		}
		if(n > 2) {
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
	System.out.print("Enter number = ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	Primefactors number = new Primefactors(n);
	number.getPrimeFactors();
	}
}
