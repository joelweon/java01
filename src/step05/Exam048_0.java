package step05;

public class Exam048_0 {
  public static void main(String[] args) {
    int count = 0;

    while (count < 10) {
      System.out.println(++count);

    }
    count = 0;
    System.out.println("-------------------------");
    while (count < 10) {
      System.out.println(count++);
    }
  }
}
