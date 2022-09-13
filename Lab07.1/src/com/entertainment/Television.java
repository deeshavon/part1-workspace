package com.entertainment;

import java.util.Set;

public class Television {

  public static final int MIN_VOLUME = 0;
  public static final int MAX_VOLUME = 100;

  private static int instanceCount = 0;
  private String brand;
  private int volume;
  private DisplayType display = DisplayType.LED;

  public Television() { //line 4 and this line (7) must match
    instanceCount++;

  }

  public Television(String brand) {
    this();
    setBrand(brand);
  }

  public Television(String brand, int volume) {
    this(brand);
    setVolume(volume);
  }

  public Television(String brand, int volume, DisplayType display) {
    this(brand);
    setDisplay(display);
  }

  public void turnOn() {
    boolean isConnected = verifyInternetConnection();
    System.out.println("The" + brand + " television is on, with a volume of " + volume);
  }

  public void turnOff() {
    System.out.println("The" + brand + "television is off");
  }

  public static int getInstanceCount() {
    return instanceCount;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    if(brand.equals("Samsung") || brand.equals("Sony")) {
      this.brand = brand;
    }else{
      System.out.println("Only accepts Samsung, LG or Sony televisions");
    }

  }

  public int getVolume() {
    return this.volume;
  }

  public void setVolume(int volume) {

    if (volume < MIN_VOLUME || volume > MAX_VOLUME) {
      System.out.printf("%d is invalid; volume must be between %d and %d (inclusive).%n", volume, MIN_VOLUME, MAX_VOLUME);
    } else {
      this.volume = volume;
    }

  }

  public DisplayType getDisplay() {
    return display;
  }

  public void setDisplay(DisplayType display) {
    this.display = display;
  }

  private boolean verifyInternetConnection() {
    return true;
  }

  @Override
  public String toString() {
    return "Televison: {brand='" + brand + ", volume" + volume + "display" + display;
  }
}
