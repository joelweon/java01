package step11;

public class Exam075_1 {
  static class A  {}


  static class B extends A {}



  public static void main(String[] args) {
    A obj1 = new A();
    String str = obj1.toString();
    System.out.println(str);

  }
}

/*
instatceof 연산자
[인스턴스 주소] instanceof [클래스명] => boolean 리턴
*/
