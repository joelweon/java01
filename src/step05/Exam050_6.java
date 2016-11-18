package step05;

public class Exam050_6 {
  public static void main(String[] args) {
    for (int i = 2; i < 10; i++) {
      for (int j = 1; j < 10; j += 1) {
        System.out.printf("%d X %d = %d\n", i, j, i * j);
      }
      System.out.println();
    }


  }
}
