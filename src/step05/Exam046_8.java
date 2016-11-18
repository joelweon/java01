package step05;

public class Exam046_8 {
  public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);

    if (age < 8)
      if (age < 2)
        System.out.println("아기입니다.");
      else
        System.out.println("어린이입니다.");

  }
}
