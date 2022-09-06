public class Television {

  public static final int MIN_VOLUME = 0;
  public static final int MAX_VOLUME = 100;

  private static int instanceCount = 0;
  private String brand;
  private int volume;

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

  public void turnOn() {
    boolean isConnected = verifyInternetConnection();
    System.out.println("The" + brand + " television is on, with a volume of " + volume);
  }

  void turnOff() {
    System.out.println("The" + brand + "television is off");
  }

  public static int getInstanceCount() {
    return instanceCount;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
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

  private boolean verifyInternetConnection() {
    return true;
  }

  @Override
  public String toString() {
    return "Televison{brand='" + brand + ", volume" + volume;
  }
}
