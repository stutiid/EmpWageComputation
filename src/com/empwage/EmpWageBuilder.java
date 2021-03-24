package com.empwage;

public class EmpWageBuilder 
{
	// constants
	final static int IS_FULL_TIME = 1;
	final static int EMP_RATE_PER_HR = 20;
	final static int IS_PART_TIME = 2;
	final static int TOTAL_WORKING_DAYS = 20;
	final static int TOTAL_WORKING_HR = 100;

	public static void main(String args[]) 
	{
		// welcome message
		System.out.println("Welcome to employee wage computation problem");
		// variables
		int totalEmpWage = 0;
		int totalWorkingHrs = 0;
		int days = 0;
		// checking whether the maximum days or maximum hrs is reached
		while (days < TOTAL_WORKING_DAYS && totalWorkingHrs <= TOTAL_WORKING_HR) 
		{
			days++;
			int empHrs = 0;
			double empCheck = Math.floor(Math.random() * 10) % 3;
			// checking how much employee has worked daily
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
			totalWorkingHrs += empHrs; // adding daily empHrs to get total Working hour he has worked
			System.out.println("emp hrs : " + empHrs);
		}
		totalEmpWage = totalWorkingHrs * EMP_RATE_PER_HR; // total salary of employee
		System.out.println("Total employee wage = " + totalEmpWage);
	}
}
