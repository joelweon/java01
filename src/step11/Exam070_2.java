package step11;

public class Exam070_2 {
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
    B obj = new B();
    obj.v1 = 100;
    obj.v2 = 200;
    // obj.v3 = 300;   <-- 컴파일 오류.

  }
}
