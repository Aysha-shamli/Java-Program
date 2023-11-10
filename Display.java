package com.EmployeeWage;
class Employee{
    static int wagePerHour = 20;
    static int fullTimeHours = 8;
    static int partTimeHours = 4;
    int totalWage;
    int totalHoursWorked;
    int totalDaysWorked;
    public Employee() {
        this.totalWage = 0;
        this.totalHoursWorked = 0;
        this.totalDaysWorked = 0;
    }
    public void workFullTime() {
        if (totalHoursWorked + fullTimeHours <= 100 && totalDaysWorked < 20) {
            totalHoursWorked += fullTimeHours;
            totalDaysWorked++;
            totalWage += wagePerHour * fullTimeHours;
        }
    }

    public void workPartTime() {
        if (totalHoursWorked + partTimeHours <= 100 && totalDaysWorked < 20) {
            totalHoursWorked += partTimeHours;
            totalDaysWorked++;
            totalWage += wagePerHour * partTimeHours;
        }
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
