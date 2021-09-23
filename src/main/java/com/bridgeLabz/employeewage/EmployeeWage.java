package com.bridgeLabz.employeewage;

public class EmployeeWage {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Calculation Program");
        int IS_EMPLOYEE_FULL = 1;
        int IS_PART_TIME = 2;

        int RATE_PER_HOUR = 20;

        int empWage= 0;
        int empHrs = 0;

        double employeecheck = Math.floor(Math.random()*10) % 3;
        if ( IS_EMPLOYEE_FULL == employeecheck ) {
            empHrs = 8;
        }
        else if ( IS_PART_TIME == employeecheck)
            empHrs = 4;
        else
            empHrs = 0;

        empWage =empHrs * RATE_PER_HOUR;
        System.out.println("Employee Wage is " +empWage);

    }

}
