package com.bridgeLabz.employeewage;

import com.bridgeLabz.EmployeeWageMultiple.CompanyEmpWage;

public class EmpWageBuilderArray {

    public static final int IS_EMPLOYEE_FULL = 1;
    public static final int IS_PART_TIME = 2;

    private int numofCompany = 0;
    private CompanyEmpWage[] companyEmpWagearray;

    public EmpWageBuilderArray() {
        companyEmpWagearray = new CompanyEmpWage[5];
    }

    private void addCompEmpWage(String company, int noWorkingDays, int maxHrsPerMonth, int ratePerHour) {
        companyEmpWagearray[numofCompany] = new CompanyEmpWage(company, noWorkingDays, maxHrsPerMonth, ratePerHour);
        numofCompany++;
    }

    public void computeEmpWage() {
        for (int i = 0; i < numofCompany; i++) {
            companyEmpWagearray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWagearray[i]));
            System.out.println(companyEmpWagearray[i]);
        }
    }


    public int computeEmpWage(CompanyEmpWage companyEmpWage) {

        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

        while (totalEmpHrs <= companyEmpWage.maxHrsPerMonth && totalWorkingDays < companyEmpWage.noWorkingDays) {
            totalWorkingDays++;
            int employeecheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (employeecheck) {
                case IS_EMPLOYEE_FULL:
                    empHrs = 8;
                    break;
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day" + totalWorkingDays + " emp hrs is " + empHrs);
        }
        return totalEmpHrs * companyEmpWage.ratePerHour;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Calculation Program");
        EmpWageBuilderArray empWageBuilderArray = new EmpWageBuilderArray();
        empWageBuilderArray.addCompEmpWage("VishalMart", 20,100,20);
        empWageBuilderArray.addCompEmpWage("Reliance", 22, 90, 25);
        empWageBuilderArray.computeEmpWage();

    }

}
