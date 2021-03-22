package com.empwage;

public class EmpWageBuilder {
public static void main(String args[]) {
	//welcome message
	System.out.println("Welcome to employee wage computation problem");
	//constants
	final int IS_FULL_TIME=1;
	//variables
	double empCheck;
	//computation
	empCheck=Math.floor(Math.random()*10)%2;
	if (empCheck==IS_FULL_TIME)
		System.out.println("Employee is Present");
	else
		 System.out.println("Employee is Absent");
}
}
