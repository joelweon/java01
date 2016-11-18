package step15;

public class Exam085_0 {
  static class A {
    int v1;
    public A() {
      System.out.println("A()....");
      v1 = 100;
    }
  }

  static class B extends A {
    int v2;
    public B() {
      System.out.println("B()...");
      v2 = 200;
    }
  }

  public void m1() {
    super(); //컴파일 오류. super()는 생성자에서 사용해야한다.
  }

  static class C extends B {
    int v3;
    public C() {
      System.out.println("C()...");
      v3 = 300;
    }
  }

  public static void main(String[] args) {
    B obj = new B();
    System.out.println("-------------------------");
  }

}