package step04;

public class Exam036_4 {
  public static void main(String[] args) {
    int a = 10;
    float b = 7;

    float result = a / b;
    System.out.println(result);

    byte b1 = 10, b2 = 20;
    int b3 = b1 + b2;
    System.out.println(b3);
    byte b4 = 10 + 30;
    System.out.println(b4);
    byte b5 = 100 + 27;
    System.out.println(b5);


  }
}
//float은 4바이트 중 24비트(8백만)만 사용
//자바에서 최소 연산은 int.
//byte의 연산은 자동으로 int로 바뀌기 때문에 int에 담아야한다.
