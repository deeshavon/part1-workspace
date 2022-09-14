package com.hr.personnel;

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
    return String.format("%s Rate =%s ", super.toString(), getHours(),getRate());
  }
}
