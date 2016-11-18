//주제: parameter(매개변수)와 argument(인자-원인이 되는 것)
//      값을 넘기고 받는 방법

public class Exam008 {
  public static void main(String[] args) {
    m1("홍길동"); // -> argument(인자) - 넘겨주는 값
    m2("James");
  }

  static void m1(String name) {  //parameter(매개변수)
    System.out.print(name);
    System.out.print("님 안녕하세요.\n");
  }

  private static void m2(String name) {  //parameter(매개변수)
    System.out.print("Hello, ");
    System.out.print(name + "\n"); //변수명에 \n 쓸 수 없다.
  }
}


//모든 시작점은 항상 main
