package step11;

public class Exam068_2 {

  public static void main(String[] args) {
    MyCalculator calc =new MyCalculator();

    //3 * 2 + 4 - 7 = 3
    calc.plus(7);
    calc.minus(5);
    calc.power(5);
    calc.remainder(3);
    System.out.println(calc.result);

  }
}
