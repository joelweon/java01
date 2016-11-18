package step15;

public class Exam083_1 {
  static class A {
    int v1;
    public A() {
      // 항상 첫 줄은 수퍼 클래스의 생성자 호출 명령어가 있어야 한다.
      super();
      System.out.println("A()...");
      v1 = 100;
    }
  }

  static class B extends A {
    int v2;
    public B() {
      // 항상 첫 줄은 수퍼 클래스의 생성자 호출 명령어가 있어야 한다.
      super();
      System.out.println("B()...");
      v2 = 200;
    }
  }

  static class C extends B {
    int v3;
    public C() {
      // 항상 첫 줄은 수퍼 클래스의 생성자 호출 명령어가 있어야 한다.
      super();
      System.out.println("C()...");
      //super(); // 첫 문장이 아니면 컴파일 오류 발생!
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