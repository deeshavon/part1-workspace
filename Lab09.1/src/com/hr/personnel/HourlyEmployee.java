package com.hr.personnel;

import gov.irs.TaxPayer;
import java.time.LocalDate;

public class HourlyEmployee extends Employee {
  private double rate;
  private double hours;

  public HourlyEmployee() {
  }

  public HourlyEmployee (String name, LocalDate hireDate) {
    super(name, hireDate);
  }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
    this(name, hireDate);
    setRate(rate);
    setHours(hours);

    }


  // TODO: 9/13/22 Declare and implement a constructor that takes name, hireDate, rate, hours as parameters. 
  
  // TODO: 9/13/22 Generate setters and getters for rate and hours.  

  // TODO: 9/13/22 Override toString method

  public void pay() {
    System.out.printf("%s is paid hourly, for a total of %,.2f%n", getName(), getHours() * getRate() );
  }

  public double getRate() {
    return rate;
  }

  public void setRate(double rate) {
    this.rate = rate;
  }

  public double getHours() {
    return hours;
  }

  public void setHours(double hours) {
    this.hours = hours;
  }

  @Override
  public String toString() {
    // return.toString() +
    return String.format("%s, rate =%.2f, hours=%.1f ", super.toString(), getHours(),getRate()); //"a format string" w/in first () should go on this line
  }

  @Override
  public void payTaxes() {
    System.out.printf("%s paid taxes of %,.2f%n", getName(), rate*hours*HOURLY_TAX_RATE);


    // public static final double HOURLY_TAX_RATE = 0.25;
    //    public static final double SALARIED_TAX_RATE = 0.30;
  }
}
