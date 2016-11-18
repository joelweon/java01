/*
프로그램 아규먼트로 나이를 입력 받아 성년, 미성년 여부를 출력하시오!
*/

package step04.test;

public class Test01{
  public static void main(String[] args) {
    System.out.println();


    int age = Integer.parseInt(args[0]);

    String result = (age < 19) ? "미성년" : "성년";
    System.out.println(result);

    System.out.println();

  }
}
