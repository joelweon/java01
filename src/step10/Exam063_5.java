package step10;

import java.util.Scanner;

public class Exam063_5 {
  static class MyType {
    static int a; // 스태틱 변수
    int b; // 인스턴스 변수
  }

  public static void main(String[] args) {
    int c; // 로컬 변수
    c = 100;

    MyType.a = 200;

    MyType obj = new MyType();
    obj.b = 300;
  }
}
