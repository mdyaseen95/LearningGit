package com.bridgeLabz.employeewage;

public class EmployeeWage {
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Calculation Program");
        int IS_EMPLOYEE_FULL = 1;
        int employeeCheck = (int) Math.floor(Math.random() * 10) % 2;
        if (employeeCheck == IS_EMPLOYEE_FULL)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee Not Present");
    }

}
