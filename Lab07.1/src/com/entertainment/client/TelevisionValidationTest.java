package com.entertainment.client;

import com.entertainment.Television;

public class TelevisionValidationTest {

  public static void main(String[] args) {
    Television tv = new Television();

    //tv1.setBrand
    tv.setVolume(4);  //should stick
    System.out.println(tv);

    tv.setVolume(-42);
    System.out.println(tv);

    tv.setBrand("Toyota");
    System.out.println(tv);

    tv.setBrand("Samsung");
    System.out.println(tv);

    tv.setBrand("Invalid");
    System.out.println(tv); //volume should be 0
  }

}
