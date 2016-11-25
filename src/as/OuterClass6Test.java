package as;

public class OuterClass6Test {
  
  public static void main(String[] args) {
    OuterClass6.Bike a = new OuterClass6.Bike();
    
    OuterClass6 outer = new OuterClass6();
    OuterClass6.Car c = outer.new Car();
  }
}