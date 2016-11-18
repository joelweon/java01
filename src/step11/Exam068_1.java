package step11;

public class Exam068_1 {

  public static void main(String[] args) {
    NamCalculator calc = new NamCalculator();

    //3 * 2 + 4 - 7 = 3
    calc.plus(3);
    calc.multiple(2);
    calc.plus(4);
    calc.minus(7);
    System.out.println(calc.result);

  }
}
