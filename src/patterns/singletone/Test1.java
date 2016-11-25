package patterns.singletone;

public class Test1 {

  public static void main(String[] args) {
    Car c1 = new Car();
    Car c2 = new Car();
    if (c1 != c2) {
      System.out.println("c1 != c2");
    }
    
//    private 생성자는 외부에서 호출할 수 없다.
//    따라서 인스턴스 생성 불가!
//    Car2 x2 = new Car2();

       Car2 x1 = Car2.getInstance();
       Car2 x2 = Car2.getInstance();
       
       if (x1 == x2) {
         System.out.println("x1 = x2");
       }
  }

}
