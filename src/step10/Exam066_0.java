package step10;

public class Exam066_0 {

  static class MyType {
    static int a;
    int b = 100;//인스턴스에서 이 문장 먼저 실행

    static {
      System.out.printf("스태틱 블록: a=%d\n", MyType.a);
      MyType.a = 50;
    }

    {
      System.out.printf("인스턴스 블록: a=%d\n", MyType.a, this.b);
      this.b = 60;
    }

    public MyType() {
      System.out.printf("생성자: a=%d, b=%d\n", MyType.a, this.b);
      MyType.a = 500;
      this.b = 600;
    }
  }


  public static void main(String[] args) {
    MyType obj = new MyType();
    System.out.printf("main: a=%d, b=%d\n", MyType.a, obj.b);
  }
}
