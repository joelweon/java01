package step11;

public class Exam069_0 {
  static class A {}
  static class B extends A {}
  static class C extends A {}
  static class D extends B {}
  public static void main(String[] args) {
    LCalculator calc = new LCalculator();


    //3 * 2 + 4 - 7 = 3
    calc.plus(3);
    calc.multiple(2);
    calc.plus(4);
    calc.minus(7);
    System.out.println(calc.result);

  }
}
/*
class 클래스명
상속 계층도(class hierachy)
   A
B      C
D
*/
