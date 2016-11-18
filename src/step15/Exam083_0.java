package step15;

public class Exam083_0 {
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

  static class C extends B {
    int v3;
    public C() {
      System.out.println("C()...");
      v3 = 300;
    }
  }

  public static void main(String[] args) {
    A obj1 = new A();
    System.out.println("-------------------------");

    B obj2 = new B();
    System.out.println("-------------------------");

    C obj3 = new C();
    System.out.println("-------------------------");
  }


}