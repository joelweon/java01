package step10;

public class Exam065_0 {

  static class MyType {
    static byte b;
    static short s;
    static char c;
    static int i;
    static long l;
    static float f;
    static double d;
    static boolean bool;
  }

  public static void main(String[] args) {
    System.out.println(MyType.b);
    System.out.println(MyType.s);
    System.out.println((int)MyType.c);
    System.out.println(MyType.i);
    System.out.println(MyType.l);
    System.out.println(MyType.f);
    System.out.println(MyType.d);
    System.out.println(MyType.bool);

  }
}
