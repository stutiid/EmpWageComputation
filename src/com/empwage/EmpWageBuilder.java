package com.empwage;

public class EmpWageBuilder {
public static void main(String args[]) {
	//welcome message
	System.out.println("Welcome to employee wage computation problem");
	//constants
	final int IS_FULL_TIME=1;
	final int EMP_RATE_PER_HR=20;
	final int IS_PART_TIME=2;
	//variables
	double empCheck;
	int empHrs=0;
	int empWage=0;
	//computation
	empCheck=Math.floor(Math.random()*10)%3;
	if(empCheck==IS_FULL_TIME)
		empHrs=8;
	else if(empCheck==IS_PART_TIME)
		empHrs=4;
	else
		empHrs=0;
	empWage=empHrs*EMP_RATE_PER_HR;
	System.out.println("EmpWage = "+empWage);
}
}
