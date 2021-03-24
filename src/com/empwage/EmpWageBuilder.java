package com.empwage;

public class EmpWageBuilder {
	public static void main(String args[]) {
		// welcome message
		System.out.println("Welcome to employee wage computation problem");
		// constants
		final int IS_FULL_TIME = 1;
		final int EMP_RATE_PER_HR = 20;
		// variables
		double empCheck;
		int empHrs = 0;
		int empWage = 0; // initial wage
		// computation
		empCheck = Math.floor(Math.random() * 10) % 3;
		// checking how many hrs employee has worked
		if (empCheck == IS_FULL_TIME)
			empHrs = 8;
		else
			empHrs = 0;
		empWage = empHrs * EMP_RATE_PER_HR;
		System.out.println("EmpWage = " + empWage);
	}
}
