// 주제: Literal - 문자열과 이스케이프 문자(Escape charter)
package step02;

public class Exam020{
  public static void main(String[] args) {
    System.out.println("문자열");
    // 문자열 속에 넣을 수 있는 특별한 명령어들 
    System.out.println("\uAC00나다");
    System.out.println("Hello, \nworld!");
    System.out.println("Hello, \t\tworld!");
    System.out.println("Hello, \bworld!");
    System.out.println("나는 \"홍길\"입니다.");
    System.out.println("나는 \'홍\'길 입니다.");
    System.out.println("나는 \\헝길\\입니다.");
    System.out.println(true);
  }
}
