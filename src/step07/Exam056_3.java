package step07;

public class Exam056_3 {
  public static void main(String[] args) {
    String s1 = "길동이";
    String s2 = "길동이";
    String s3 = "길동이";

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
