package step05;

public class Exam048_7 {
  public static void main(String[] args) {
    int dan = 2;
    int num = 1;
    while (dan < 10) {
      while (num < 10) {
        System.out.printf("%d X %d = %d\n", dan, num, dan * num);
        num += 1;
      }
      dan += 1;
      num = 1;
      System.out.println();
    }
  }
}

/* 코딩 순서
구구단 출력
*/
