package step12;

public class Exam077_2 {
  static class A {
    /*static Class class;*/
    String name;
    int age;

    public void m1() {System.out.println("HELLOOOOO");}
    public void m2() {}
    public void m3() {}
  }

  public static void main(String[] args) throws Exception {
    A obj = new A();
    obj.m1();
    Class clazz1 = A.class;
    A obj2 = (A)clazz1.newInstance();
    obj2.m1();
    //ㄴ 클래스 정보를 이용하여 인스턴스를 생성하는 방법.   <reflection API>



  }
}
