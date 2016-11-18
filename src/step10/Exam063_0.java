package step10;

public class Exam063_0 {
  static class MyType {
    static int a;
    int b;

  }
  public static void main(String[] args) {
    MyType.a = 100;
    System.out.println(MyType.a);

    //MyType.b = 100; -->오류    b는 인스턴스 변수.
    MyType obj = new MyType();
    obj.b = 200;

    MyType obj2 = new MyType();
    obj2.b = 300;

    System.out.println(obj.b);
    System.out.println(obj2.b);
  }
}
