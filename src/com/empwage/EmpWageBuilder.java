package com.empwage;

import java.util.ArrayList;

/*@description- below class compute the employee total salary according to 
 * different companies parameters   
 *@Parameters- employee's total working hours and total number of days employee worked
 * are used to calculate employee's salary   */
public class EmpWageBuilder {
	// constants
	final static int IS_FULL_TIME = 1;
	final static int IS_PART_TIME = 2;
	// instance variables
	ArrayList<Company> companyList = new ArrayList<Company>();

	// To add multiple companies with their parameters to calculate employee wage
	public void addCompanyDetailsForEmpWage(String companyName, int empRatePerHr, int numnberOfWorkingDays,
			int maxWorkingHrsPerMonth) {
		Company company = new Company(companyName, empRatePerHr, numnberOfWorkingDays, maxWorkingHrsPerMonth);
		companyList.add(company);
	}

	// compute employee wages for particular companies
	public void companyEmpWage() {
		for (int i = 0; i < companyList.size(); i++) {
			empWgaeComputation(this.companyList.get(i));
		}
	}

	// print the employee total and daily wage for each company by overriding
	// toString method
	public void printEmpWageForCompany() {
		for (int i = 0; i < companyList.size(); i++)
			System.out.println(this.companyList.get(i).toString());
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
		while (days < company.numberOfWorkingDays && totalWorkingHrs <= company.maxWorkingHrsPerMonth) {
			days++;
			int empHrs = this.getEmpHrs();
			totalWorkingHrs += empHrs;
			company.dailyWage[days] = empHrs * company.empRatePerHr;
		}
		company.totalEmpWage = totalWorkingHrs * company.empRatePerHr;
	}

	public static void main(String args[]) {
		// welcome message
		System.out.println("Welcome to employee wage computation problem");
		System.out.println("Calculating wages for employees");
		EmpWageBuilder empWageBuilder = new EmpWageBuilder();
		empWageBuilder.addCompanyDetailsForEmpWage("Dmart", 10, 20, 16);
		empWageBuilder.addCompanyDetailsForEmpWage("BigBasket", 20, 20, 20);
		empWageBuilder.addCompanyDetailsForEmpWage("Reliance", 10, 20, 10);
		empWageBuilder.companyEmpWage();
		empWageBuilder.printEmpWageForCompany();
	}
}