package step05;

public class Exam045_5 {
  static int a = 20;
  int x = 100;

  public static void main(String[] args) {
    int args = 20;  //오류
  }

  static void m1(int a) {
    int b;
    {
      int c;
    }
  }
}
