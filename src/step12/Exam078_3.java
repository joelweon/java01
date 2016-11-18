package step12;

public class Exam078_3 {

  public static void main(String[] args) throws Exception {
    String s1 = new String("Hello");  //Heap 인스턴스에 존재.
    String s2 = s1.intern();  //상수풀에 스트링 인스턴스 생성
    String s3 = "Hello";


    if (s1 != s2) System.out.println("s1 != s2");
    if (s2 == s3) System.out.println("s2 == s3");
  }
}
