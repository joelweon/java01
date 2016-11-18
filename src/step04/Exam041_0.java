package step04;

public class Exam041_0 {
  public static void main(String[] args) {
    System.out.println();

    int age = 10;
    //(조건) ? 참일때 실행할 명령어 : 거짓일 때 실행할 명령어
    //<오류!> (10 > 20) ? System.out.println("10 < 20") : System.out.println("10 >= 20");
    //(age < 19) ? System.out.println("미성년") : System.out.println("성년");
    //(age <19) ? ("미성년") : ("성년");
    String result = (age < 19) ? "미성년" : "성년";
    System.out.println(result);

    System.out.println();

  }
}
