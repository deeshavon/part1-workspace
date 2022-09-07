public class TelevisionValidationTest {

  public static void main(String[] args) {
    Television tv = new Television();
    tv.setVolume(4);  //should stick
    tv.setVolume(-42);
    tv.getVolume();
    tv.setBrand("Toyota");
    tv.setBrand("Samnsung");
    tv.setBrand("Invalid");
    System.out.println(tv); //volume should be 0
  }

}
