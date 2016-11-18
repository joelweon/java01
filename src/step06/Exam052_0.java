package step06;

public class Exam052_0 {
  public static void main(String[] args) {
    int count = 6;
    int starCount = 0;
    while (--count > 0) {
      while (starCount++ < count) {
        System.out.print("*");
      }
      System.out.println();
      starCount = 0;
    }

  }
}
