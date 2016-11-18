package step11;

public class Exam073_1 {
  static class A {
    int v1;
    void m1(String value, int value2) {
      v1 = 100;
      System.out.println("A.m1()");
    }
  }

  static class B extends A {
    int v2;
    void m1(int value2, String value) {
      v1 = 200;
      v2 = 200;
      System.out.println("B.m1()");
    }
  }



  public static void main(String[] args) {
    B obj = new B();
    obj.m1("2000", 2000);
    System.out.println(obj.v1);
    System.out.println(obj.v2);

  }
}
//오버라이딩 하려면 타입 순서가 일치해야한다.
//만일 타입순서가 다르고 메소드 이름이 같다면 이것은 오버로딩.
// => 새 메소드가 추가 된 것.
