package step12;

public class Exam078_2 {
  public static void main(String[] args) throws Exception {
    String s1 = new String("Hello");
    String s2 = new String("Hello");


    //주소가 다르다
    if (s1 != s2) System.out.println("s1 != s2");
    //값이 같다.
    if (s1.equals(s2)) System.out.println("s1과 s2의 내용이 같다.");

  }
}
