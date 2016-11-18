// 주제: 서식 문자열을 출력하는 방법
package step01;

public class Exam018{
  public static void main(String[] args) {
    String name = "홍길동";
    int age = 20;

    System.out.println("이름: " + name + ", 나이: " + age);

    System.out.printf("이름: %s, 나이: %d\n", name, age);

  }
}
