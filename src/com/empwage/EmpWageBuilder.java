package com.empwage;

public class EmpWageBuilder {
	// constants
	final static int IS_FULL_TIME = 1;
	final static int EMP_RATE_PER_HR = 20;
	final static int IS_PART_TIME = 2;
	final static int TOTAL_WORKING_DAYS = 20;
	final static int TOTAL_WORKING_HR = 100;

	// instance variables
	private int totalEmpWage = 0;
	private int totalWorkingHrs = 0;
	private int days = 0;

	// class method to get working hour of a employee for a day
	public int getEmpHrs() {
		int empHrs;
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
		return empHrs;
	}

	// class method to calculate total salary till the maximum days or maximum hrs
	// is reached
	public void empWgaeComputation() {
		while (days < TOTAL_WORKING_DAYS && totalWorkingHrs <= TOTAL_WORKING_HR) {
			days++;
			int empHrs = this.getEmpHrs();
			// adding daily empHrs to get total Working hour he has worked
			totalWorkingHrs += empHrs;
			System.out.println("emp hrs : " + empHrs);
		}
		// total salary of employee
		totalEmpWage = totalWorkingHrs * EMP_RATE_PER_HR;
	}

	public static void main(String args[]) {
		// welcome message
		System.out.println("Welcome to employee wage computation problem");
		System.out.println("Calculating wages for employee1");
		EmpWageBuilder emp1 = new EmpWageBuilder();
		emp1.empWgaeComputation();
		System.out.println(
				"Total employee1 salary " + emp1.totalEmpWage + " and total working hrs " + emp1.totalWorkingHrs);
		System.out.println("Calculating wages for employee2");
		EmpWageBuilder emp2 = new EmpWageBuilder();
		emp2.empWgaeComputation();
		System.out.println(
				"Total employee2 salary " + emp2.totalEmpWage + " and total working hrs " + emp2.totalWorkingHrs);
	}
}
