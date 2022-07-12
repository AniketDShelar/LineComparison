package com.bridgelabz.assignmentsday5;
import java.util.*;

public class Largestnumber {
	double n1;
	double n2;
	double n3;
	Largestnumber(double n1, double n2, double n3){
	this.n1 = n1;
	this.n2 = n2;
	this.n3 = n3;
	}
	void getLargestNumber() {
		if(n1 >= n2 && n1 >= n3) {
			System.out.println(n1+ " is Largest than other numbers");
		}else if (n2 >= n3 && n2 >= n3) {
			System.out.println(n2+ " is Largest than other numbers");
		}else {
			System.out.println(n3+ " is Largest than other numbers");
		}
	}
	public static void main(String[] args) {
	System.out.println("Enter n1,n3 & n3 = ");
	Scanner number = new Scanner(System.in);
	double n1 = number.nextDouble();
    double n2 = number.nextDouble();
    double n3 = number.nextDouble();
    Largestnumber result = new Largestnumber(n1, n2, n3);
    result.getLargestNumber();
	}
}
