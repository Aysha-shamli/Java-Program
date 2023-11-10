package com.EmployeeWage;
import java.util.Random;
class Employee1 {
    public void checkAttendance(boolean isPresent) {
        if (isPresent) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
public class employeeCheck {
    public static void main(String[] args) {
        Random random = new Random();
        boolean isPresent = random.nextBoolean();

        Employee1 employee = new Employee1();
        employee.checkAttendance(isPresent);
    }
}
