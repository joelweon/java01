package step12;

public class Exam077_1 {
  static class A {
    String name;
    int age;

    public void m1() {}
    public void m2() {}
    public void m3() {}
  }

  public static void main(String[] args) throws Exception {
    A obj = new A();
    Class clazz1 = obj.getClass();

    String classNameWithPackageName = clazz1.getName();
    String classNameOnly = clazz1.getSimpleName();

    System.out.println(classNameWithPackageName);
    System.out.println(classNameOnly);
    System.out.println(clazz1.toString());

    System.out.println(clazz1.isMemberClass());
    System.out.println(clazz1.isLocalClass());

    class B {}
    System.out.println(B.class.isMemberClass());  //inner 클래스 여부
    System.out.println(B.class.isLocalClass());


  }
}
