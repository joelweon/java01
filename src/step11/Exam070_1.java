package step11;

public class Exam070_1 {
  static class A {
    int v1;
  }

  static class B extends A {
    int v2;
  }
  static class X extends A {
    int vx;
  }

  static class C extends B {
    int v3;
  }

  public static void main(String[] args) {
    C obj = new C();
    obj.v3 = 300;
    System.out.println(obj.v3);

    obj.v2 = 100;  // <-- 수퍼 클래스 B 설계도에 따라 만든 변수
    System.out.println(obj.v2);

    obj.v1 = 200;  // <-- 수퍼 클래스 A 설계도에 따라 만든 변수.
    System.out.println(obj.v1);

    //obj.vx = 500;  <-- 컴파일 오류.

  }
}
