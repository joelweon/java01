package step04;

public class Exam036_5 {
  public static void main(String[] args) {
    System.out.println();


    String s1 = "홍길동";
    String s2 = "입니다";
    String s3 = s1 + s2;
    System.out.println(s3);
    System.out.println();

    String v1 = "나이는 ";
    int age = 20;
    String v2 = "입니다.";
    String v3 = v1 + age + v2;
    System.out.println(v3);

    System.out.println("문자열" + 3.14f);  //f는 4바이트 부동소수점 값이라는 뜻 f출력x
    System.out.println("문자열" + 3.14);
    System.out.println("문자열" + true);
    System.out.println("문자열" + '가');
  }
}
//float은 4바이트 중 24비트(8백만)만 사용
//int
