package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

public class TelevisionClient {

  public static void main(String[] args) {

    Television tv1 = new Television();
    tv1.setBrand("Zenith");
    tv1.setVolume(125);
    tv1.setDisplay(DisplayType.CRT);


    tv1.turnOn();
    tv1.turnOff();
    System.out.println(tv1.toString());

    System.out.printf("%d television instances created%n", Television.getInstanceCount());

    Television tv2 = new Television();
    tv2.setBrand("RCA");
    tv2.setVolume(10);


    tv2.turnOn();
    tv2.turnOff();

    System.out.printf("%d television instances created%n", Television.getInstanceCount());

    System.out.println(tv1.toString()); //These two lines are identical
    System.out.println(tv2);

    Television tv3 = new Television ("LG");
    System.out.println(tv3);
    System.out.printf("%d television instances created%n", Television.getInstanceCount());
  }
}
