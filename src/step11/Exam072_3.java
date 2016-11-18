package step11;

public class Exam072_3 {
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
    A obj1 = new C();
    obj1.m1();
    //obj1.m2(); // A에 없다 -> 오류
    //obj1.m3(); // A에 없다 -> 오류
    ((C)obj1).m2(); //컴파일 성공
    ((C)obj1).m3();  //컴파일 성공
    //  =>  C temp   <--obj1 값
    //실행할 떄 임시 C클래스의 레퍼런스가 생성되고 obj1 값이 들어간다.
    System.out.println("-----------------------------");

    C temp = (C)obj1;
    temp.m1();
    temp.m2();
    temp.m3();
  }
}
