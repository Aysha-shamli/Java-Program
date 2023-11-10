package com.EmployeeWage;
import java.util.Scanner;
public class monthlyWage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1 for Full-Time Employee or 2 for Part-Time Employee: ");
        int input = scanner.nextInt();

        Employee fulltimeEmployee = new Employee(20, 8, 20);
        Employee partTimeEmployee = new Employee(20, 4, 20);
        int dailyWage;
        int monthlyWage;

        switch (input) {
            case 1:
                dailyWage = fulltimeEmployee.calculateDailyWage();
                monthlyWage = fulltimeEmployee.calculateMonthlyWage();
                System.out.println("Full-Time Employee's Daily Wage: " + dailyWage);
                System.out.println("Full-Time Employee's Monthly Wage: " + monthlyWage);
                break;
            case 2:
                dailyWage = partTimeEmployee.calculateDailyWage();
                monthlyWage = partTimeEmployee.calculateMonthlyWage();
                System.out.println("Part-Time Employee's Daily Wage: " + dailyWage);
                System.out.println("Part-Time Employee's Monthly Wage: " + monthlyWage);
                break;
            default:
                System.out.println("Invalid Employee Type");
        }
    }
}






