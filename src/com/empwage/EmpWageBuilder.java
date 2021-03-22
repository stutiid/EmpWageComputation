package com.empwage;

public class EmpWageBuilder {
public static void main(String args[]) {
	//welcome message
	System.out.println("Welcome to employee wage computation problem");
	//constants
	final int IS_FULL_TIME=1;
	final int EMP_RATE_PER_HR=20;
	final int IS_PART_TIME=2;
	final int TOTAL_WORKING_DAYS=20;
	final int TOTAL_WORKING_HR=100;
	//variables
	double empCheck;
	int empHrs=0;
	int totalEmpWage=0;
	int totalWorkingHrs=0;
	int days=0;
	//computation
	while(days<TOTAL_WORKING_DAYS && totalWorkingHrs<TOTAL_WORKING_HR)
	{
		days++;
		empCheck=Math.floor(Math.random()*10)%3;
		switch ((int)empCheck)
		{
			case IS_FULL_TIME: empHrs=8;
							   break;
			case IS_PART_TIME: empHrs=4;
							   break;
			default : empHrs=0;
		}
		totalWorkingHrs+=empHrs;
	}
	totalEmpWage=totalWorkingHrs*EMP_RATE_PER_HR;
	System.out.println("EmpWage = "+totalEmpWage);
}
}
