package com.empwage;

/*@description- below class compute the employee total salary according to 
 * different companies parameters   
 *@Parameters- employee's total working hours and total number of days employee worked
 * are used to calculate employee's salary   */
public class EmpWageBuilder {
	// constants
	final static int IS_FULL_TIME = 1;
	final static int IS_PART_TIME = 2;

	// instance variable
	private final String company;
	private final int numbersOfWorkingDays;
	private final int maxHoursPerMonth;
	private final int empRatePerHr;

	public EmpWageBuilder(String company, int numbersOfWorkingDays, int maxHoursPerMonth, int empRatePerHr) {
		super();
		this.company = company;
		this.numbersOfWorkingDays = numbersOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
		this.empRatePerHr = empRatePerHr;
	}

	// method to get working hour of a employee for a day
	public int getEmpHrs() {
		int empHrs;
		double empCheck = Math.floor(Math.random() * 10) % 3;
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

	// method to calculate total salary till the maximum days or maximum hrs
	// is reached
	public void empWgaeComputation() {
		int days = 0;
		int totalWorkingHrs = 0, totalEmpWage;
		while (days < numbersOfWorkingDays && totalWorkingHrs <= maxHoursPerMonth) {
			days++;
			int empHrs = getEmpHrs();
			totalWorkingHrs += empHrs;
			System.out.println("emp hrs : " + empHrs);
		}
		totalEmpWage = totalWorkingHrs * empRatePerHr;
		System.out.println("Total Emp wage for company " + this.company + " is " + totalEmpWage);
	}

	public static void main(String args[]) {
		// welcome message
		System.out.println("Welcome to employee wage computation problem");
		EmpWageBuilder dMart = new EmpWageBuilder("Dmart", 20, 10, 2);
		EmpWageBuilder reliance = new EmpWageBuilder("Reliance", 10, 20, 4);
		dMart.empWgaeComputation();
		reliance.empWgaeComputation();
	}
}
