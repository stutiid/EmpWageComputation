package com.empwage;

public class EmpWageBuilder {
	// constants
	final static int IS_FULL_TIME = 1;
	final static int EMP_RATE_PER_HR = 20;
	final static int IS_PART_TIME = 2;

	public static void main(String args[]) {
		// welcome message
		System.out.println("Welcome to employee wage computation problem");
		// variables
		double empCheck;
		int empHrs = 0;
		int empWage = 0;
		// computing employee daily working hrs
		empCheck = Math.floor(Math.random() * 10) % 3;
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
		empWage = empHrs * EMP_RATE_PER_HR;
		System.out.println("EmpWage for a day " + empWage);
	}
}
