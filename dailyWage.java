package com.EmployeeWage;

public class dailyWage {

    public static void main(String[] args) {

        Employee fulltimeEmployee = new Employee(20,8);
        Employee partTimeEmployee = new Employee(20, 4);
        int dailyWage1 = fulltimeEmployee.calculateDailyWage();
        int dailyWage2 = partTimeEmployee.calculateDailyWage();
        System.out.println("Full time Employee's Daily Wage: " + dailyWage1);
        System.out.println("Part time Employee's Daily Wage: " + dailyWage2);

    }
}

