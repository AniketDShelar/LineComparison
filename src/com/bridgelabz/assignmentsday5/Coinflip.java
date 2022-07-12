package com.bridgelabz.assignmentsday5;
import java.util.*;

public class Coinflip {
	public static void main(String[] args) {
	System.out.print("Enter the number = ");
	Scanner input = new Scanner(System.in);
	int num = input.nextInt();
	int heads = 0;
	int tails = 0;
	if (num > 0) {
	double[] result = new double[num];
	for (int i = 0; i < num; i++) {
		result[i] = Math.random();
		if (result[i] < 0.5) {
		tails++;
		}else {
			heads++;
		      }
	       }	
				float percentage_of_tails = (tails * 100)/num;
	       		System.out.println("percentage o tails = " +percentage_of_tails);
	 		    float percentage_of_heads = (heads * 100)/num;
	 		    System.out.println("percentage of heads = " +percentage_of_heads);
	    }else{
	    	System.out.println("Enter valid number");
	    }
	}
}
