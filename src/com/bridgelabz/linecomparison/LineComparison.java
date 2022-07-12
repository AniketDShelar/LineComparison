package com.bridgelabz.linecomparison;

import java.util.Scanner;
public class LineComparison {
	float x1, x2, x3, x4, y1, y2, y3, y4;
	LineComparison(float x1, float x2, float x3, float x4, float y1, float y2, float y3, float y4){
		this.x1 = x1;this.x2 = x2;this.x3 = x3;this.x4 = x4;this.y1 = y1;this.y2 = y2;this.y3 = y3;this.y4 = y4;
	}
	void lengths() {
		Double lineLength1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		Double lineLength2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
		if (lineLength1.equals(lineLength2)) {
			System.out.println("Both lines are equal");
		}else if (compare(lineLength1, lineLength2)) {
			System.out.println("Length 1 is greater than Length 2");
		}else {
			System.out.println("Length 2 is greater than Length 1");
		}
	}
		
	private boolean compare(Double lineLength1, Double lineLength2) {
		return false;
	}
	public static void main(String[] args) {
		LineComparison lc = new LineComparison(2,2,3,3,2,2,3,3);
		lc.lengths();
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter x1 : ");
//		int x1 = scanner.nextInt();
//		System.out.print("Enter x2 : ");
//		int x2 = scanner.nextInt();
//		System.out.print("Enter y1 : ");
//		int y1 = scanner.nextInt();
//		System.out.print("Enter y2 : ");
//		int y2 = scanner.nextInt();
//		
//		System.out.print("Enter x3 : ");
//		int x3=scanner.nextInt();
//		System.out.print("Enter x4 : ");
//		int x4=scanner.nextInt();
//		System.out.print("Enter y3 : ");
//		int y3=scanner.nextInt();
//		System.out.print("Enter y4 : ");
//		int y4=scanner.nextInt();
//		Double lineLength1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
//		Double lineLength2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
//		System.out.println(" Length of line 1 is  : "+lineLength1);
//		System.out.println(" Length of line 2 is  : "+lineLength2);
//		//used equals method 
//		if(compare(lineLength1, lineLength2)) {
//			System.out.println(" Line 1 is greater than Line 2 ");
//		}else {
//			System.out.println(" Line 2 is greater than Line 1 ");
//		}
//	}
//
//	private static boolean compare(Double lineLength1, Double lineLength2) {
//		// TODO Auto-generated method stub
//		return false;
	}
}
