//3단계
package step08;

public class Exam061_3 {
  static class Calculator {
    static int sum = 0;

    static void plus(int a) {sum += a;}
    static void minus(int a) {sum -= a;}
    static void multiple(int a) {sum *= a;}
    static void devide(int a) {sum /= a;}
  }

  public static void main(String[] args) {
    //3 + 2 * 3 - 1 = 14
    //연산자 우선순위 고려X
    Calculator.plus(3);
    Calculator.plus(2);
    Calculator.multiple(3);
    Calculator.minus(1);
    System.out.println(Calculator.sum);

  }




}
