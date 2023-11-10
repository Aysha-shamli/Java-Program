package com.EmployeeWage;
class Employee{

    private int wagePerHour;
    private int hoursWorked;
    private int workingDaysPerMonth;

    // Constructor
    public Employee(int wagePerHour, int hoursWorked, int workingDaysPerMonth) {
        this.wagePerHour = wagePerHour;
        this.hoursWorked = hoursWorked;
        this.workingDaysPerMonth = workingDaysPerMonth;

    }

    public int calculateDailyWage() {
        return wagePerHour * hoursWorked;
    }
    public int calculateMonthlyWage() {
        return wagePerHour * hoursWorked*workingDaysPerMonth;
    }
    public void checkAttendance(boolean isPresent) {
        if (isPresent) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
    static void displayWelcomeMessage() {
        System.out.println("Welcome to Employee Wage Computation Program!");
    }
}
public class Display {
    public static void main(String[] args) {
        Employee.displayWelcomeMessage();
    }

}
