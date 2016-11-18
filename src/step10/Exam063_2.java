package step10;

public class Exam063_2 {
  static class MyType {

    static void m1() {
      System.out.println("스태틱 메서드 호출...");
    }

    void m2() {
      System.out.println("인스턴스 메서드 호출...");
    }
  }
  
  public static void main(String[] args) {
    MyType obj = new MyType();

    MyType.m1();
    obj.m2();

  }
}
