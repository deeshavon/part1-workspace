public class TelevisionClient {

  public static void main(String[] args) {

    Television tv1 = new Television();
    tv1.setBrand("Zenith");
    tv1.setVolume(25);


    tv1.turnOn();
    tv1.turnOff();
    System.out.println(tv1.toString());

    Television tv2 = new Television();
    tv2.setBrand("RCA");
    tv2.setVolume(10);


    tv2.turnOn();
    tv2.turnOff();

    System.out.println(tv1.toString()); //These two lines are identical
    System.out.println(tv2);
  }
}
