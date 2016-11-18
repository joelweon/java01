//  다형적 변수
package step11;

public class Exam072_1 {
  static class A {
    int v1;
    void m1() {
      System.out.println("A.m1()");
    }
  }

  static class B extends A {
    int v2;
    void m2() {
      this.v1 = 100;
      this.v2 = 200;
      System.out.println("B.m2()");
    }
  }

  static class C extends B {
    int v3;
    void m3() {
      this.v1 = 100;
      this.v2 = 200;
      this.v3 = 300;
      System.out.println("C.m3()");
    }
  }

  public static void main(String[] args) {
    A a1 = new A();
    A a2 = new B();
    A a3 = new C();

    //B b1 = new A();
    //b1.m2(); //B의 m2() 메서드에서 B의 v2 변수를 사용할 수 있기 때문에  컴파일 오류!
    B b2 = new B();
    B b3 = new C();

    //C a1 = new A();
    //C a1 = new B();
    C c3 = new C();


  }
}
