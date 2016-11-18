package step10;

public class Exam063_3 {
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

    obj.m1();// ---->  MyType.m1(); 으로 해줄 것. 가독성을 위해.
    obj.m2();

  }
}
