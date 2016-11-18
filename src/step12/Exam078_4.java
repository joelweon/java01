package step12;

public class Exam078_4 {

  public static void main(String[] args) throws Exception {
    String s1 = "Hello, world";
    //Immutable의 예
    String s2 = s1.replace('o', 'x');//기존 스트링을 복제해서 새 스트링을 만든 다음 문자
    System.out.println(s1);
    System.out.println(s2);

  //Mutable의 예
  StringBuffer buf1 = new StringBuffer("Hello, world");
  buf1.replace(2, 4, "xx");
  System.out.println(buf1);
  }
}
