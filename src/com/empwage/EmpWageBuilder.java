package com.empwage;

public class EmpWageBuilder {
	final static int IS_FULL_TIME = 1;
	final static int EMP_RATE_PER_HR = 20;
	final static int IS_PART_TIME = 2;
	final static int TOTAL_WORKING_DAYS = 20;

	public static void main(String args[]) {
		// welcome message
		System.out.println("Welcome to employee wage computation problem");
		// variables
		double empCheck;
		int empHrs = 0;
		int totalEmpWage = 0;
		int totalWorkingHrs = 0;
		// calculating wages for total or maximum number of working days
		for (int days = 0; days < TOTAL_WORKING_DAYS; days++) {
			empCheck = Math.floor(Math.random() * 10) % 3;
			// checking each day working hrs
			switch ((int) empCheck) {
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			case IS_PART_TIME:
				empHrs = 4;
				break;
			default:
				empHrs = 0;
			}
			System.out.println(empHrs);
			totalWorkingHrs += empHrs; // adding each day working hour to get total employee working hrs
		}
		totalEmpWage = totalWorkingHrs * EMP_RATE_PER_HR;
		System.out.println("total empWage for " + TOTAL_WORKING_DAYS + " is " + totalEmpWage);
	}
}
