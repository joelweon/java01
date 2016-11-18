//오버라이딩 다시 정리.
package step11;

public class Exam073_0 {
  static class A {
    int v1;
    void m1(String value) {
      v1 = 100;
      System.out.println("A.m1()");
    }
  }

  static class B extends A {
    int v2;
    // 수퍼 클래스의 메서드 재정의.
    void m1(String v) {
      v1 = 200;
      v2 = 200;
      System.out.println("B.m1()");
    }
  }

//파라미터 신경 쓰지말고 오버라이딩 되는 것만 볼 것. 타입 같고 메서드 이름같음->오버라이딩

  public static void main(String[] args) {
    B obj = new B();
    obj.m1("2000");
    System.out.println(obj.v1);
    System.out.println(obj.v2);

  }
}
