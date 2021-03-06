package com.empwage;

import java.util.Arrays;

public class Company {
	public final String companyName;
	public final int empRatePerHr;
	public final int numberOfWorkingDays;
	public final int maxWorkingHrsPerMonth;
	public int totalEmpWage = 0;
	public int[] dailyWage = new int[20];

	public Company(String companyName, int empRatePerHr, int numberOfWorkingDays, int maxWorkingHrsPerMonth) {
		super();
		this.companyName = companyName;
		this.empRatePerHr = empRatePerHr;
		this.numberOfWorkingDays = numberOfWorkingDays;
		this.maxWorkingHrsPerMonth = maxWorkingHrsPerMonth;
	}

	@Override
	public String toString() {
		return "Company:" + companyName + " [totalEmpWage=" + totalEmpWage + "]\n" + "dailyWage="
				+ Arrays.toString(dailyWage);
	}

}
