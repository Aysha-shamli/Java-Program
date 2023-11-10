package com.EmployeeWage;

public class dailyWage {

    public static void main(String[] args) {

        Employee employee = new Employee(20,8);
        int dailyWage = employee.calculateDailyWage();
        System.out.println("Employee's Daily Wage: " + dailyWage);

    }
}

