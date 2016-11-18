//  메서드 오버라이딩2
package step11;

public class Exam072_1 {
  static class A {
    void m1() {
      System.out.printf("A.m1()\n");
    }
    void m2() {
      System.out.printf("A.m2()\n");
    }
  }

  static class B extends A {
    void m1() {
      System.out.printf("B.m1()\n");
    }
    void m3() {
      System.out.printf("B.m3()\n");
    }
    void test1() {
      this.m1();
      this.m2();

    }
    void test2() {
      super.m1();  //오버라이딩 하기 전에 메서드 호츨
      //super.m3();  --> 수퍼클래스에서 찾는다.(계속) 없다면 컴파일 오류.
      this.m3();  //ok
      super.m2();  // 슈퍼클래스에서 찾는다.
    }
  }

  public static void main(String[] args) {
    B obj = new B();
    obj.test1();
    System.out.println("--------------------");
    obj.test2();
  }
}
