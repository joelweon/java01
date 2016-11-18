//5단계
package step08;

public class Exam061_5 {
  static class Calculator {
    int sum = 0;  //인스턴스 변수로 선언.

    static void plus(Calculator that, int a) {that.sum += a;}
    static void minus(Calculator that, int a) {that.sum -= a;}
    static void multiple(Calculator that, int a) {that.sum *= a;}
    static void devide(Calculator that, int a) {that.sum /= a;}
  }

  public static void main(String[] args) {
    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();


    Calculator.plus(c1, 3);
    Calculator.plus(c2, 4);
    Calculator.plus(c1, 2);
    Calculator.multiple(c2, 5);

    Calculator.multiple(c1, 3);
    Calculator.minus(c2, 7);

    Calculator.minus(c1, 1);
    Calculator.divide(c2, 2);

    System.out.println(c1.sum);
    System.out.println(c2.sum);

  }
}
