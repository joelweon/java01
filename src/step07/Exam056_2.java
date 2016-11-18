package step07;

public class Exam056_2 {
  public static void main(String[] args) {
    String s1 = new String ("길동이"); //Constants poll에 새 인스턴스 생성
    String s2 = new String ("길동이"); //기존에 생성된 인스턴스 주소를 리턴
    String s3 = new String ("길동이");

    if (s1 == s2) {
      System.out.println("s1 == s2");
    }

    if (s1 == s3) {
      System.out.println("s1 == s2");
    }
    if (s2 == s3) {
      System.out.println("s2 == s2");
    }
  }
}
