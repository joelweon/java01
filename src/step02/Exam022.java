// 주제: Literal - 정수와 메모리 크기
package step02;

public class Exam022{
  public static void main(String[] args) {
    System.out.println(100);
    System.out.println(1);     //실행할 때 4바이트 메모리 차지 1을저장하든 100을 하든
    System.out.println(100L);  //실행할 때 8바이트 메모리 차지

  }
}

/*
리터럴 정수의 종류 <2가지>
=> 8바이트 l을 붙인다. 100l 200l
  주로 l 영문자는 숫자1과 비슷하기 때문에 대문자 L을 붙여라
=> 리터럴 세계에서는 2바이트는 없음.
*/
