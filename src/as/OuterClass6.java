package as;

public class OuterClass6 {
  
  static class Bike {
    public void run() {
      System.out.println("쌩달림");
    }
  }
  
  class Car {
    public void run() {
      System.out.println("달림");
    }
  }
  
  public void m1() {
    Car c = new Car();
    c.run();
    
    Bike b = new Bike();
    b.run();
  }
  static public void m2() {
    Bike b = new Bike();
    b.run();
  }
  
}