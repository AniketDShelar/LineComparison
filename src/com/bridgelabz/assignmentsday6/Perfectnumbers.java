package com.bridgelabz.assignmentsday6;
import java.util.*;

public class Perfectnumbers{
	int n;
	int sum = 0;
	Perfectnumbers(int n){
	this.n = n;
	}
	void getPerfectNumber() {
		for (int i = 1; i < n; i++) {
			if(n % i == 0) {
			sum = sum + i;
			}
		}
		if (sum == n) {
			System.out.println(n+ " is a Perfect Number");
		}else {
			System.out.println(n+ " is not Perfect Number");
		}
	}
	public static void main(String[] args) {
	System.out.print("Enter number = ");
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	Perfectnumbers number = new Perfectnumbers(n);
	number.getPerfectNumber();
	}
}