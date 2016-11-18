package step04;

public class Exam037_3 {
  public static void main(String[] args) {
    System.out.println();

    int a = 10;
    int result = a++;
    System.out.printf("a = %d, result = %d\n", a, result);

    a = 10;
    a = a++;
    System.out.println(a);

    a = 10;
    int b = a++;
    System.out.println(b);
    System.out.println(a);
  }
}
