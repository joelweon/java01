// 주제 : Literal - 부동 소수점을 메모리에 저장하는 방법
// 부동 소수점 --> 2진수 --> 메모리에 저장 가능
package step02;

public class Exam029 {

  public static final float value = 12.375f;
  public static final float ok = 12.375f;

  public static void main(String[] args) {
    System.out.println(987.654321234567f);      //7자리까지 정확하게 저장됨.
    System.out.println(987.654321234567);      //15자리까지 정확하게 저장됨.
  }
}
//그러나 6자리가 안전함.
