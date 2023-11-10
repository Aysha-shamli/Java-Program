package com.EmployeeWage;
import java.util.Random;

public class employeeCheck {
    public static void main(String[] args) {
        Random random = new Random();
        boolean isPresent = random.nextBoolean();

        Employee employee = new Employee(20,8);
        employee.checkAttendance(isPresent);
    }
}
