package com.bridgeLabz.employeewage;

public class EmployeeWage {
    public static final int IS_EMPLOYEE_FULL = 1;
    public static final int IS_PART_TIME = 2;
    public static final int RATE_PER_HOUR = 20;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Calculation Program");
        int empWage= 0;
        int empHrs = 0;

        int employeecheck = (int) Math.floor(Math.random()*10) % 3;
        switch ( employeecheck ){
            case IS_EMPLOYEE_FULL:
                empHrs = 8;
                break;
            case IS_PART_TIME:
                empHrs = 4;
                break;
            default:
                empHrs = 0;
        }

        empWage =empHrs * RATE_PER_HOUR;
        System.out.println("Employee Wage is " +empWage);

    }

}
