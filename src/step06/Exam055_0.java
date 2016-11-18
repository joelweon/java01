package step06;

public class Exam055_0 {
  static void square(int value) {
    value *= value;
    System.out.printf("square():%d\n", value);
  }

  public static void main(String[] args) {
    int value = 3;
    square(value);
    System.out.printf("main():%d\n",value);
  }
}
