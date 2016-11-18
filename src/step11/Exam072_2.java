//  다형적 변수와 메서드 호출
package step11;

public class Exam072_2 {
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

  public static void main(String[] args) {
    System.out.println("-------------------");
    C obj1 = new C();
    obj1.m1();  //수퍼 클래스의 메서드 호출할 수 있다.
    obj1.m2();
    obj1.m3();
    System.out.println("-------------------");

    B obj2 = new B();
    obj2.m1(); //B에서는 오버라이딩 하지 않았기 때문에 수퍼 클래스의 것을 호출한다.
    obj2.m2();
    System.out.println("-------------------");

    A obj3 = new A();
    obj3.m1();  //자기꺼 호출
    System.out.println("-------------------");

    A obj4 = new C();
    obj4.m1();
    //obj4.m2();  // 메서드를 호출할 때 레퍼런스 타입(클래스)만 사용 가능 하다.
    obj4.m3();
    //현재 obj4가 누굴 가리키냐가 중요한게 아니라 어떤 타입인지에 따라 거기에서만 찾는다.

  }
}
