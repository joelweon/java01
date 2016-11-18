package step04;

public class Exam036_3 {
  public static void main(String[] args) {
    int a = 10,
        b = 7;
    float result = (float)a / b;
    System.out.println(result);

    result = a / (float)b;
    System.out.println(result);


    int v1 = 100;
    long v2 = 200;
    int result2 = v1 + v2;
    System.out.println(result2);

  }
}
//float은 4바이트 중 24비트만 사용
