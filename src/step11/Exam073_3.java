package step11;

public class Exam073_3 {
  static class A {
    void m1(String value, int value2) {
      System.out.println("A.m1()");
    }
  }

  static class B extends A {
    @Override  //오버라이드 하라는 것이 아니라, 오버라이드를 하는 것인지 검사하는 것.
    void m1(int value2, String value) {
      System.out.println("B.m1()");
    }
  }
//애노테이션 특별한 주석.


  public static void main(String[] args) {
    B obj = new B();
    obj.m1("haha", 10);

  }
}
//오버라이딩 하려면 타입 순서가 일치해야한다.
//만일 타입순서가 다르고 메소드 이름이 같다면 이것은 오버로딩.
// => 새 메소드가 추가 된 것.
