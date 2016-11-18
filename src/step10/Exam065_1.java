package step10;

public class Exam065_1 {

  static class MyType {
     byte b;
    short s;
    char c;
    int i;
    long l;
    float f;
    double d;
    boolean bool;
  }

  public static void main(String[] args) {
    MyType obj = new MyType();

    System.out.println(obj.b);
    System.out.println(obj.s);
    System.out.println((int)obj.c);
    System.out.println(obj.i);
    System.out.println(obj.l);
    System.out.println(obj.f);
    System.out.println(obj.d);
    System.out.println(obj.bool);

  }
}
