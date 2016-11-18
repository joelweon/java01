package step11;

public class Exam070_0 {
  static class A {
    int v1;
  }
  static class B extends A {
    int v2;
  }

  public static void main(String[] args) {
    B obj = new B();
    obj.v2 = 100;
    System.out.println(obj.v2);

    obj.v1 = 200;
    System.out.println(obj.v1);

  }
}
