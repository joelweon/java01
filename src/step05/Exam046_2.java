package step05;

public class Exam046_2 {
  public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);

    if (age < 19) {
      System.out.println("청소년입니다.");
      System.out.println("성인은 일반 카드를 사용하셔야 합니다.");
    }
    if (age >= 19) {
      System.out.println("성인입니다.");
      System.out.println("청소년 카드를 사용할 수 없습니다.");
    }





  }
}
