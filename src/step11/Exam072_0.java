package step11;

public class Exam072_0 {
  static class 포유류 {
    int v1;
    void m1() {
      System.out.println("A.m1()");
    }
  }

  static class 유인원 extends 포유류 {
    int v2;
    void m2() {
      System.out.println("B.m2()");
    }
  }

  static class 사람 extends 유인원 {
    int v3;
    void m3() {
      System.out.println("C.m3()");
    }
  }

  public static void main(String[] args) {
    포유류 a1 = new 포유류();
    포유류 a2 = new 유인원();
    포유류 a3 = new 사람();

    //유인원 b1 = new 포유류();
    유인원 b2 = new 유인원();
    유인원 b3 = new 사람();

    //사람 a1 = new 포유류();
    //사람 a1 = new 유인원();
    사람 c3 = new 사람();

//    A a1 = new A();
//    A a2 = new B();
//    A a3 = new C();

    //B b1 = new A();  //오류
//    B b2 = new B();

    //C c1 = new A();  //오류
    //C c2 = new B();  //오류
//    C c3 = new C();

  }
}
