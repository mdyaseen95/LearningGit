package com.bridgeLabz.EmployeeWageMultiple;

public class CompanyEmpWage {
    private final String company;
    public final int noWorkingDays;
    public final int maxHrsPerMonth;
    public final int ratePerHour;
    public  int totalEmpWage;

    public CompanyEmpWage( String company, int noWorkingDays, int maxHrsPerMonth, int ratePerHour) {
        this.company = company;
        this.noWorkingDays = noWorkingDays;
        this.maxHrsPerMonth = maxHrsPerMonth;
        this.ratePerHour = ratePerHour;
    }

    public void setTotalEmpWage ( int totalEmpWage ){
        this.totalEmpWage = totalEmpWage;
    }
    @Override
    public String toString() {
        return "Total wage for " + noWorkingDays + " days of " + company + " is : " + totalEmpWage;
    }
}
