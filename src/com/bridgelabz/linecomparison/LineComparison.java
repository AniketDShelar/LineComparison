package com.bridgelabz.linecomparison;

import java.util.Scanner;
public class LineComparison {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter x1 : ");
		int x1 = scanner.nextInt();
		System.out.println("Enter x2 : ");
		int x2 = scanner.nextInt();
		System.out.println("Enter y1 : ");
		int y1 = scanner.nextInt();
		System.out.println("Enter y2 : ");
		int y2 = scanner.nextInt();
		
		System.out.println("Enter x3 : ");
		int x3=scanner.nextInt();
		System.out.println("Enter x4 : ");
		int x4=scanner.nextInt();
		System.out.println("Enter y3 : ");
		int y3=scanner.nextInt();
		System.out.println("Enter y4 : ");
		int y4=scanner.nextInt();
		Double lineLength1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		Double lineLength2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
		System.out.println(" Length of line 1 is  : "+lineLength1);
		System.out.println(" Length of line 2 is  : "+lineLength2);
		//used equals method 
		if(lineLength1.equals(lineLength2)) {
			System.out.println(" Both Lines are equals ");
		}else {
			System.out.println(" Both Lines are not equals ");
		}
	}
}
