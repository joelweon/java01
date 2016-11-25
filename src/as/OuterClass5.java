package as;


public class OuterClass5 {
  static public void start(Car car) {
    car.run();
  }
  
  public static void main(String[] args) {
    Car car = new Car("티코") {
      public void run() {
        System.out.println(this.model + "Le go");
      }
    };
    start(car);
    
    
    start(new Car("코티") {
      public void run() {
        System.out.println(this.model + "ㄱㄱㄱ");
      }
    });
    
    
    start(new Car("키티") {
      public void run() {
        System.out.println(this.model + " ho");
      }
    });
  }
}