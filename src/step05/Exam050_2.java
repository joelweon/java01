package step05;

public class Exam050_2 {
  public static void main(String[] args) {
    int count = 0;
    for (; count < 5; count++)
      System.out.printf("%d: 하하하\n", count);
    System.out.println("=============================");

    count = 0;
    for (; count < 3;) {
      System.out.printf("%d: 하하하\n", count);
      count++;
    }
    System.out.println("=============================");

    count = 0;
    for (;;) {
      if (count >= 10)
        break;
      System.out.printf("%d: 하하하\n", count);
      count++;
    }


  }
}
