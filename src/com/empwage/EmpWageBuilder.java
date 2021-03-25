package com.empwage;

/*@description- below class compute the employee total salary according to 
 * different companies parameters   
 *@Parameters- employee's total working hours and total number of days employee worked
 * are used to calculate employee's salary   */
public class EmpWageBuilder {
	// constants
	final static int IS_FULL_TIME = 1;
	final static int IS_PART_TIME = 2;
	// instance variables
	private int numberOfCompanies = 0;
	private Company[] company;

	public EmpWageBuilder() {
		this.company = new Company[5];
	}

	// To add multiple companies with their parameters to calculate employee wage
	public void addCompanyDetailsForEmpWage(String companyName, int empRatePerHr, int numnberOfWorkingDays,
			int maxWorkingHrsPerMonth) {
		company[numberOfCompanies] = new Company(companyName, empRatePerHr, numnberOfWorkingDays,
				maxWorkingHrsPerMonth);
		numberOfCompanies++;
	}

	// compute employee wages for particular companies
	public void companyEmpWage() {
		for (int i = 0; i < numberOfCompanies; i++) {
			this.empWgaeComputation(company[i]);
		}
	}

	// method to get working hour of a employee for a day
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

	/*
	 * method to calculate total salary till the maximum days or maximum hrs is
	 * reached
	 */
	public void empWgaeComputation(Company company) {
		int days = 0;
		int totalWorkingHrs = 0;
		int totalEmpWage = 0;
		while (days < company.numberOfWorkingDays && totalWorkingHrs <= company.maxWorkingHrsPerMonth) {
			days++;
			int empHrs = this.getEmpHrs();
			totalWorkingHrs += empHrs;
			System.out.println("emp hrs : " + empHrs);
		}
		totalEmpWage = totalWorkingHrs * company.empRatePerHr;
		System.out.println("Total employee wage for company " + company.companyName + " is " + totalEmpWage);
	}

	public static void main(String args[]) {
		// welcome message
		System.out.println("Welcome to employee wage computation problem");
		System.out.println("Calculating wages for employees");
		EmpWageBuilder empWageBuilder = new EmpWageBuilder();
		empWageBuilder.addCompanyDetailsForEmpWage("Dmart", 20, 20, 100);
		empWageBuilder.addCompanyDetailsForEmpWage("BigBasket", 25, 20, 80);
		empWageBuilder.companyEmpWage();
	}
}
