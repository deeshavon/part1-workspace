package com.hr.personnel;

import gov.irs.TaxPayer;
import java.time.LocalDate;

public class SalariedEmployee extends Employee {
  private double salary;

  public SalariedEmployee() {
  }

  public SalariedEmployee(String name, LocalDate hireDate) {
    super(name, hireDate);
  }
  public SalariedEmployee(String name, LocalDate hireDate, double salary) {
    this(name, hireDate);
    setSalary(salary);

  }

  public void pay() {
    System.out.printf("%s is paid a salary of %,.2f%n", getName(), getSalary());
    // System.out.println(getName() + "is paid a salary of" + getSalary());
  }
  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  @Override
  public String toString() {
    return super.toString() + ", salary=" + getSalary();
   // return String.format("%s Salary =%s ", super.toString(), getSalary());
  }

  @Override
  public void payTaxes() {
    System.out.printf("%s paid taxes of %,.2f%n", getName(), salary*SALARIED_TAX_RATE);

  }
}
