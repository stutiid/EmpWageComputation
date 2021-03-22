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
	//variables
	double empCheck;
	int empHrs=0;
	int totalEmpWage=0;
	int totalWorkingHrs=0;
	//computation
	for(int days=0;days<TOTAL_WORKING_DAYS;days++)
	{
		empCheck=Math.floor(Math.random()*10)%3;
		switch ((int)empCheck)
		{
			case IS_FULL_TIME: empHrs=8;
									 break;
			case IS_PART_TIME: empHrs=4;
									  break;
			default : empHrs=0;
		}
		System.out.println(empHrs);
		totalWorkingHrs+=empHrs;
	}
	totalEmpWage=totalWorkingHrs*EMP_RATE_PER_HR;
	System.out.println("EmpWage = "+totalEmpWage);
}
}
