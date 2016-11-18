package step05;

public class Exam046_4 {
  public static void main(String[] args) {
    int age = Integer.parseInt(args[0]);

    if (age < 8)
      System.out.println("유아입니다.");
    else {
      if (age >= 8 && age < 14)
        System.out.println("어린이입니다.");
      else {
        if (age >= 14 && age < 19)
          System.out.println("청소년입니다.");
        else {
          if (age >= 19 && age < 40)
            System.out.println("청년입니다.");
          else {
            if (age >=40 && age < 60)
              System.out.println("중년입니다.");
            else
              System.out.println("노인입니다.");
          }
        }
      }
    }







  }
}
