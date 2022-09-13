package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
  private double salary;

  public SalariedEmployee() {
  }

  public SalariedEmployee(String name, LocalDate hireDate) {
    super(name, hireDate);
  }
  public SalariedEmployee(String name, LocalDate hireDate, double salary) {

  }
}
