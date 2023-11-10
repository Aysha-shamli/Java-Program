package com.EmployeeWage;
class Employee{

    private int wagePerHour;
    private int hoursWorked;

    // Constructor
    public Employee(int wagePerHour, int hoursWorked) {
        this.wagePerHour = wagePerHour;
        this.hoursWorked = hoursWorked;
    }
    public int calculateDailyWage() {
        return wagePerHour * hoursWorked;
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
