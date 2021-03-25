package com.empwage;

/*@Description- class is used to hold parameters of a company which are
 * used to calculate wage of a employee
 * @Parameters- company name, employee rate per hour, maximum number of working days
 *  in a month and maximum working hours in a month*/

public class Company {
	public final String companyName;
	public final int empRatePerHr;
	public final int numberOfWorkingDays;
	public final int maxWorkingHrsPerMonth;

	public Company(String companyName, int empRatePerHr, int numberOfWorkingDays, int maxWorkingHrsPerMonth) {
		super();
		this.companyName = companyName;
		this.empRatePerHr = empRatePerHr;
		this.numberOfWorkingDays = numberOfWorkingDays;
		this.maxWorkingHrsPerMonth = maxWorkingHrsPerMonth;
	}

}
