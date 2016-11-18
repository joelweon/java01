package step12;

public class Exam076_3 {
  static class A {
    String name;
    int age;

    public void m1() {}
    public void m2() {}
    public void m3() {}
  }

  public static void main(String[] args) {
    A obj1 = new A();
    A obj2 = new A();
       //인스턴스의 주소가 리턴 -> 인스턴스(객체)가 리턴한다고 말함.
    Class ref1 = obj1.getClass();
    Class ref2 = obj2.getClass();

    if (ref1 == ref2) System.out.println("ref1 == ref2");

    System.out.println(ref1.getName());
  }
}
// 클래스 로딩은 오직 한 번만 이루어지기 떄문에
// 각각의 클래스 정보는 한 개만 존재한다.
