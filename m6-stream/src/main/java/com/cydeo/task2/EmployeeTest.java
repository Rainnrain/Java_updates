package com.cydeo.task2;

import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

        // Print all the emails

        EmployeeData.readAll()
               // .map(employee -> employee.getEmpEmail())
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);

        // Print all phone numbers

        EmployeeData.readAll()
                //.flatMap(employee->employee.getEmpPhoneNumbers().stream())
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
