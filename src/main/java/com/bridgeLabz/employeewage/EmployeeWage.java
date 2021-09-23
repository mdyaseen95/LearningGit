package com.bridgeLabz.employeewage;

public class EmployeeWage {
    public static final int IS_EMPLOYEE_FULL = 1;
    public static final int IS_PART_TIME = 2;
    public static final int RATE_PER_HOUR = 20;
    public static final int N0_OF_WORKING_DAYS = 5;
    public static final int MAX_HRS_PER_MONTH = 100;

    public int calculateEmpWage() {
        int empHrs = 0, totalEmpWage = 0, totalEmpHrs = 0, totalWorkingDays = 0;

        while (totalEmpHrs <= MAX_HRS_PER_MONTH && totalWorkingDays < N0_OF_WORKING_DAYS) {
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
        totalEmpWage = totalEmpHrs * RATE_PER_HOUR;
        System.out.println("Total wage for " + N0_OF_WORKING_DAYS + " days is : " + totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Calculation Program");
        EmployeeWage e1 = new EmployeeWage();
        e1.calculateEmpWage();

    }

}
