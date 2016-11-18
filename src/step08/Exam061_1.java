//1단계
package step08;

public class Exam061_1 {
  public static void main(String[] args) {
    //3 + 2 * 3 - 1 = 14
    //연산자 우선순위 고려X
    int sum = 0;
    sum = plus(3, 2);
    sum = multiple(sum, 3);
    sum = minus(sum, 1);
    System.out.println(sum);
  }

  static int plus(int a, int b) {return a + b;}
  static int minus(int a, int b) {return a - b;}
  static int multiple(int a, int b) {return a * b;}
  static int devide(int a, int b) {return a / b;}


}
