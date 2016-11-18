package step12;

import java.lang.reflect.Method;

public class Exam077_3 {
  static class A {
    /*static Class class;*/
    String name;
    int age;

    public void m1() {System.out.println("HELLOOOOO");}
    protected void m2() {}
    public void m3() {}
    private void m4() {}
  }

  public static void main(String[] args) throws Exception {
    Class clazz = A.class;

    Method[] methods = clazz.getMethods();

    for (Method method : methods) {
      System.out.println(method.getName());
    }
    System.out.println("-----------------");

    Method[] methods2 = clazz.getDeclaredMethods();
    for (Method method : methods2) {
      System.out.println(method.getName());
    }



  }
}
