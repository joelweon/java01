package step14;

import java.util.Scanner;

public class Exam080_0 {

  static int m1(int a, int b) {
    return a / b;
  }

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    int v1 = keyScan.nextInt();
    int v2 = keyScan.nextInt();

    int result = m1(v1, v2);
    System.out.println(result);
    System.out.println("안녕히가세요!");
  }
}
