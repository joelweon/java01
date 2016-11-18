//4단계
package step08;

public class Exam061_4 {
  static class Calculator {
    static int sum = 0;

    static void plus(int a) {sum += a;}
    static void minus(int a) {sum -= a;}
    static void multiple(int a) {sum *= a;}
    static void devide(int a) {sum /= a;}
  }

  public static void main(String[] args) {
    Calculator.plus(3);
    Calculator.plus(2);
    Calculator.multiple(3);
    Calculator.minus(1);
    System.out.println(Calculator.sum);

    Calculator.sum = 0;
    Calculator.plus(4);
    Calculator.multiple(5);
    Calculator.minus(7);
    Calculator.divide(2);
    System.out.println(Calculator.sum);
  }




}
