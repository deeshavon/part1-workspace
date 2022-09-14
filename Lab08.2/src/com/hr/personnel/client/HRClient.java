/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 100.000));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 55, 10));
        // TODO: 9/13/22 Create at least 1 HourlyEmployee and 1 SalariedEmployee, passing to the addEmployee method.
        dept.addEmployee(new SalariedEmployee("Aaron Rodgers", LocalDate.of(1984, 12, 2), 450.00));
        dept.addEmployee(new HourlyEmployee("Usher Raymond", LocalDate.of(1978, 10, 14), 19230,24));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        //Pay its employees
        System.out.println("\nPay employees:");
        dept.payEmployees();

    }
}