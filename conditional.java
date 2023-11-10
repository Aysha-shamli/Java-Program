package com.EmployeeWage;

public class conditional {
    public static void main(String[] args) {
        Employee employee = new Employee();

        while (employee.totalHoursWorked < 100 && employee.totalDaysWorked < 20) {
            int employeeType = (int) (Math.random() * 2) + 1;

            switch (employeeType) {
                case 1:
                    employee.workFullTime();
                    break;
                case 2:
                    employee.workPartTime();
                    break;
            }
        }
        System.out.println("Total Working Days: " + employee.totalDaysWorked);
        System.out.println("Total Working Hours: " + employee.totalHoursWorked);
        System.out.println("Total Monthly Wage: " + employee.totalWage);
    }
}

