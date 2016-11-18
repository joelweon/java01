package step15;

public class Exam084_0 {
  static class A {
    int v1;
    public A(int a) {
      //super(); 없으면 자동으로 들어간다.
      System.out.println("A()....");
      v1 = a;
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
/*
수퍼클래스에 기본생성자가 없을때

*/