/* 주제: 예외 처리 - Error 예외 
=> 개발자가 애플리케이션에서 던지는 것이 아니다.
=> JVM이 실행 중에 예외 상황이 발생했을 때 주로 던진다.
=> 예외를 던진다고 메서드에 선언할 필요가 없다.
   물론 선언해도 된다.
*/
package step14;

import java.util.Scanner;

public class Exam080_4 {
  // 예외를 던진다고 메서드에 선언할 필요는 없다.
  static int m1() {
    throw new Error("예외 발생!");
  }

  // 예외를 던진다고 선언해도 된다. 선택사항이다.
  static int m2() throws Error {
    throw new Error("예외 발생!");
  }
  
  public static void main(String[] args) {

  }
}

