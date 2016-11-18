package step15;

public class Exam083_3 {
  static class A {
    int v1;

    public A() {
      //super(); 없으면 자동으로 들어간다.
      System.out.println("A()....");
      v1 = 100;
    }
  }

  static class B extends A {
    int v2;

    public B() {
      //super();
      System.out.println("B()...");
      v2 = 200;
    }
  }

  static class C extends B {
    int v3;

    public C() {
      //super();
      System.out.println("C()...");
      v3 = 300;
    }
  }

  public static void main(String[] args) {
    C obj3 = new C();
  }


}
