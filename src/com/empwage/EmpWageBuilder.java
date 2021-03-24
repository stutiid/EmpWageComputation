package com.empwage;

public class EmpWageBuilder {
	// constants
	public final static int IS_FULL_TIME = 1;
	public final static int EMP_RATE_PER_HR = 20;
	public final static int IS_PART_TIME = 2;

	public static void main(String args[]) {
		// welcome message
		System.out.println("Welcome to employee wage computation problem");
		// variables
		double empCheck;
		int empHrs = 0;
		int empWage = 0;
		// checking how many hrs employee has worked
		empCheck = Math.floor(Math.random() * 10) % 3;
		if (empCheck == IS_FULL_TIME)
			empHrs = 8;
		else if (empCheck == IS_PART_TIME)
			empHrs = 4;
		else
			empHrs = 0;
		empWage = empHrs * EMP_RATE_PER_HR;
		System.out.println("EmpWage for a day = " + empWage);
	}
}
