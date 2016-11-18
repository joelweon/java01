package step08;

public class Exam061_6 {
  static class Calculator {
    int sum = 0;  //인스턴스 변수로 선언.


    void plus(int a) {this.sum += a;}
    void minus(int a) {this.sum -= a;}
    void multiple(int a) {this.sum *= a;}
    void devide(int a) {this.sum /= a;}
  }

  public static void main(String[] args) {
    Calculator c1 = new Calculator();
    Calculator c2 = new Calculator();


    c1.plus(3);
    c2.plus(4);
    c1.plus(2);
    c2.multiple(5);

    c1.multiple(3);
    c2.minus(7);

    c1.minus(1);
    c2.divide(2);

    System.out.println(c1.sum);
    System.out.println(c2.sum);

  }
}
