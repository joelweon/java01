package step11;

public class Exam075_0 /*extends Object*/ {
  static class A /*extends Object*/ {}


  static class B extends A {}



  public static void main(String[] args) {
    //어떤 클래스의 인스턴스 또는 자손인지 확인하는 방법
    A obj1 = new A();
    B obj2 = new B();

    if (obj1 instanceof A) {
      System.out.println("obj1은 A의 인스턴스이다.");
    }
    if (obj1 instanceof Object) {
      System.out.println("obj1은 A의 인스턴스이다.");
    }
    if (obj2 instanceof B) {
      System.out.println("obj2는 B의 인스턴스이다.");
    }
    if (obj2 instanceof A) {
      System.out.println("obj2는 A의 자손이다.");
    }
    if (obj2 instanceof Object) {
      System.out.println("obj1은 A의 인스턴스이다.");
    }
  }
}

/*
instatceof 연산자
[인스턴스 주소] instanceof [클래스명] => boolean 리턴
*/
