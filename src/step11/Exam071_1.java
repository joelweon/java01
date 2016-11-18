package step11;

public class Exam071_1 {
  static class A {
    int v1 = 10;
    int v3 = 10;
    void m1() {
      System.out.printf("A.m1(): v1=%d\n", this.v1);
      System.out.printf("A.m1(): v3=%d\n", this.v3);

    }
  }

  static class B extends A {
    int v1 = 100;
    int v2 = 100;
    void m2 () {
      System.out.printf("B.m2(): v1=%d\n", this.v1);
      System.out.printf("B.m2(): v2=%d\n", this.v2);
      System.out.printf("B.m1(): v3=%d\n", this.v3);

    }
  }

  public static void main(String[] args) {
    A obj = new A();
    obj.m1();
    System.out.println("---------------------------");

    B obj2 = new B();
    obj2.m2();
    obj2.m1();
//       ㄴ 자신이 속한 클래스의 인스턴스 변수일 경우-> 그 클래스의 인스턴스 변수를 사용.
//          자신이 속한 클래스의 인스턴스 변수가 아닐 경우,
/*
    obj2.v1 = 200;
    obj2.m1();
*/
  }
}
