package step10;

public class Exam064_0 {
  static {
    System.out.println("Exam064_0: 스태틱 초기화 블록 실행");
  }



  static class MyType {
    static int a;
    int b;
    static void m1() {
      System.out.println("MyType: m1()");
    }
    static {
      System.out.println("MyType: 스태틱 초기화 블록");
    }
  }


  public static void main(String[] args) {
    System.out.println("main()...");
    //MyType.a = 100;  //MyType 클래스 로딩 --> 스태틱 변수 생성 --> 스태틱 초기화 블록 실행
    //MyType.m1();
    //new MyType();
    MyType obj = null;
  }
}
