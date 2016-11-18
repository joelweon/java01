package step04;

public class Exam042_0 {
  public static void main(String[] args) {
    System.out.println();

    int a = 0b0110_1100;
    int b = 0b0011_0001;
    int c = a & b;
    int d = a | b;
            //a & b 0010_0000
            //a | b 0111_1101
    System.out.println(c);
    System.out.println(Integer.toString(c, 2));

    System.out.println(d);
    System.out.println(Integer.toString(d, 2));

    int e = a ^ b;
    System.out.println(e);
    System.out.println(Integer.toString(e, 2));

    int n = a ~ b;
    System.out.println(n);
    System.out.println(Integer.toString(n, 2));
    //10






    System.out.println();

  }
}
