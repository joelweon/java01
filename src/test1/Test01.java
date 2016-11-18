package test1;

public class Test01 {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      String a = (i % 2 == 0) ? "짝수" : "홀수";
      System.out.printf("%d(%s)\n", i, a);
    }
  }
}
