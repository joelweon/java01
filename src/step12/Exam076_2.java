package step12;

public class Exam076_2 {
  static class A {
    String name;
    int age;
  }
  static class B {
    String name;
    int age;

    @Override//              object와 그 자손들 -> 모든 인스턴스 /수퍼 클래스와 같은 타입
    public boolean equals(Object obj) {
      if (!(obj instanceof B)) return false;
      B other = (B)obj;
      if (this.age != other.age) return false;
      if (!this.name.equals(other.name)) return false;
      return true;
    }
  }
  public static void main(String[] args) {
    A obj1 = new A();
    obj1.name = "홍길동";
    obj1. age = 20;

    A obj2 = new A();
    obj2.name = "홍길동";
    obj2.age = 20;

    System.out.println(obj1.equals(obj2));
    System.out.println("----------------------");


    B obj3 = new B();
    obj3.name = "홍길동";
    obj3. age = 20;

    B obj4 = new B();
    obj4.name = "홍길동";
    obj4.age = 20;

    System.out.println(obj3.equals(obj4));
    System.out.println("----------------------");
  }
}
// euals =:> 인스턴스가 다르면 false
//
