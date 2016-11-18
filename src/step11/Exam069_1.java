package step11;

public class Exam069_1 {
  static class A {}
  static class B extends A {}
  static class C extends A {}
  static class D extends B {}
  static class D extends A, B {} 
  public static void main(String[] args) {
    LCalculator calc = new LCalculator();


    //3 * 2 + 4 - 7 = 3

  }
}
/*
class 클래스명
상속 계층도(class hierachy)
   A
B      C
D
*/
