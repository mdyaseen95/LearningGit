package com.bridgeLabz.employeewage;

public class EmployeeWage {

    public static final int IS_EMPLOYEE_FULL = 1;
    public static final int IS_PART_TIME = 2;

    private final String company;
    private final int noWorkingDays;
    private final int maxHrsPerMonth;
    private final int ratePerHour;
    private  int totalEmpWage;

    public EmployeeWage( String company, int noWorkingDays, int maxHrsPerMonth, int ratePerHour){
        this.company = company;
        this.noWorkingDays = noWorkingDays;
        this.maxHrsPerMonth = maxHrsPerMonth;
        this.ratePerHour = ratePerHour;
    }

    public int calculateEmpWage( ) {

        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;

        while (totalEmpHrs <= maxHrsPerMonth && totalWorkingDays < noWorkingDays) {
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
        totalEmpWage = totalEmpHrs * ratePerHour;
        return 0;
        }
    @Override
    public String toString(){
        return "Total wage for " + noWorkingDays + " days of " +company +" is : " + totalEmpWage ;
    }


    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Calculation Program");
        EmployeeWage vishalMart = new EmployeeWage("Vishalmart", 20,100,30);
        EmployeeWage relianceMart = new EmployeeWage("Reliance ",22,90,25);
        vishalMart.calculateEmpWage();
        System.out.println(vishalMart);
        relianceMart.calculateEmpWage();
        System.out.println(relianceMart);

    }

}
