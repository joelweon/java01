package step11;

public class Exam069_2 {
  static class A {
    int v1;
    void m1() {
      System.out.println("A.m1()");
    }
  }
  static class B extends A {
    int v2;
    void m2() {
      System.out.println("B.m2()");
    }
  }
  static class C extends B {
    int v3;
    void m3() {
      System.out.println("C.m3()");
    }
  }
  static class D extends C {
    int v4;
    void m4() {
      System.out.println("D.m4");
    }
  }

  public static void main(String[] args) {
    C obj = new C();

  }
}
