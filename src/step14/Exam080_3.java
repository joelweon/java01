
package step14;

import java.util.Scanner;

public class Exam080_3 {
  static int m1(int a, int b) {
    if (b == 0) {
      throw new Error("0으로 나눌 수 없습니다.");
    }
    return a / b;
  }

  static int m2(int a, int b) throws Exception {
    if (b == 0) {
      throw new Exception("0으로 나눌 수 없습니다.");
    }
    return a / b;
  }

  static int m3(int a, int b) {
    if (b == 0) {
      // throw 는 반드시 java.lang.Throwable 객체만 던질 수 있다.
      // 당연히 Throwable 서브 클래스도 포함하는 것이다.
      //throw new String("0으로 나눌 수 없습니다."); // 컴파일 오류!
    }
    return a / b;
  }
  
  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);
    int v1 = keyScan.nextInt();
    int v2 = keyScan.nextInt();

    try { // try 블록 안에는 원래 하려했던 작업 코드를 작성한다.
      int result = m1(v1, v2);
      System.out.println(result);

    } catch (Error e) { // catch 블록 안에는 예외 상황을 처리하는 코드를 작성한다.
      System.out.println(e.getMessage()); // e 객체에 들어 있는 예외 내용을 출력한다.

    } finally { // 정상적으로 수행하든, 예외가 발생하든 상관없이
                // 무조건 실행되어야 하는 코드를 작성한다.
      System.out.println("안녕히 가세요!");
    }
  }
}
