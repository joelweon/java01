package step12;

public class Exam077_0 {
  static class A {
    /*static Class class;*/ // <-모든 클래스는 무조건 이 변수를 내장하고 있다.(내장 변수)
    String name;
    int age;

    public void m1() {}
    public void m2() {}
    public void m3() {}
  }

  public static void main(String[] args) throws Exception {
    A obj = new A();
    Class clazz1 = obj.getClass();

    Class clazz2 = A.class;  //<-스태틱 변수명.

    Class clazz3 = Class.forName("step12.Exam077_0$A");

    if (clazz1 == clazz2) System.out.println("clazz1 == clazz2");
    if (clazz1 == clazz3) System.out.println("clazz1 == clazz3");

  }
}
