package com.EmployeeWage;
import java.util.Scanner;
public class switchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1 for Full-Time Employee or 2 for Part-Time Employee: ");
        int input = scanner.nextInt();

        Employee fulltimeEmployee = new Employee(20,8);
        Employee partTimeEmployee = new Employee(20, 4);
        int dailyWage;

        switch (input) {
            case 1:
                dailyWage = fulltimeEmployee.calculateDailyWage();
                System.out.println("Full-Time Employee's Daily Wage: " + dailyWage);
                break;
            case 2:
                dailyWage = partTimeEmployee.calculateDailyWage();
                System.out.println("Part-Time Employee's Daily Wage: " + dailyWage);
                break;
            default:
                System.out.println("Invalid Employee Type");
        }
    }
}

