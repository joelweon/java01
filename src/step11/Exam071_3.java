package step11;

public class Exam072_2 {
  static class A {
    void m1() {
      System.out.printf("A.m1()\n");
    }
    void m2() {
      System.out.printf("A.m2()\n");
    }
  }

  static class B extends A {
    void m2() {
      System.out.printf("B.m2()\n");
    }
    void m3() {
      System.out.printf("B.m3()\n");
    }
  }

  static class C extends B {
    void m2() {
      System.out.printf("C.m2()\n");
    }
    void m3() {
      System.out.printf("C.m3()\n");
    }
    void m4() {
      System.out.printf("C.m4()\n");
    }
    void test1() {
      //super.m4();  // 조상 클래스들 중 m4() 메서드가 없다. 오류!
      super.m1();
      super.m2();  //바로 상위 부터 찾고 없으면 그 위...계속. 꼭대기도 없으면 오류
      super.m3();
      //super.super.m2();  <--존재하지 않음.
      //this는 현재 클래스 부터 위로 올라간다.
    }
  }

  public static void main(String[] args) {
    C obj = new C();
    obj.test1();

  }
}
