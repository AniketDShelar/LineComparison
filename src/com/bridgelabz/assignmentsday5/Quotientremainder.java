package com.bridgelabz.assignmentsday5;
import java.util.*;

public class Quotientremainder {
	int dividend;
	int divisor;
	float quotient;
	int remainder;
	Quotientremainder(int dividend, int divisor){
	this.dividend = dividend;
	this.divisor = divisor;
	}
	void getquotient() {
		quotient = dividend / divisor;
	}
	void getremainder() {
		remainder = dividend % divisor;
	}
	void display() {
		System.out.println("Quotient = " +quotient);
		System.out.println("Remainder = "+remainder);
	}
	public static void main(String[] args) {
		System.out.print("Enter Dividend and Divisor = ");
		Scanner input = new Scanner(System.in);
		int dividend = input.nextInt(); int divisor = input.nextInt();
		Quotientremainder qr = new Quotientremainder(dividend, divisor);
		qr.getquotient();
		qr.getremainder();
		qr.display();
	}
}
