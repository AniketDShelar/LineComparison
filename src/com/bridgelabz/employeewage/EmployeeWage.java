package com.bridgelabz.employeewage;

public class EmployeeWage {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;
	private static final int MAX_WORKING_HRS = 100;
	private static final int NUM_OF_WORKING_DAYS = 20;
	
	public static int calculateEmpWage(int wagePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		int empHrs = 0, empWage = 0, totalEmpWage = 0, totalWorkingHrs = 0, totalWorkingDays = 0;
		while (totalWorkingHrs <= MAX_WORKING_HRS && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			totalWorkingDays ++;
			int empcheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empcheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
			}
			totalWorkingHrs+= empHrs;
			System.out.println("day#: "+totalWorkingDays+ " total working hours = "+empHrs);
		}
		  totalEmpWage = totalWorkingHrs * wagePerHour;
		  System.out.println("Total Employee Wage = "+totalEmpWage);
		  return totalEmpWage;
	}
		public static void main(String[] args) {
			calculateEmpWage(20, 5, 90);
	}
}