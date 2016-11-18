package step15;

public class Exam084_1 {
  static class A {
    int v1;
    public A(int a) {
      System.out.println("A(int a)....");
      v1 = a;
    }
  }

  static class B extends A {
    int v2;
    public B() {
      super(100);
      System.out.println("B()...");
      v2 = 200;
    }
  }

  static class C extends B {
    int v3;
    public C() {
      // super();
      System.out.println("C()...");
      v3 = 300;
    }
  }

  public static void main(String[] args) {

    C obj3 = new C();
    System.out.println("-------------------------");
  }


}