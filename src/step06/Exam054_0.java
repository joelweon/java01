package step06;

public class Exam054_0 {
  static void greeting(String[] names) {
    System.out.print("Hello, ");
    for (String name : names) {
      System.out.print(name + ",");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    greeting(new String[]{"홍길동","임꺽정","유관순"});
    //greeting("홍길동"); // 컴파일 오류!
    greeting(new String[]{"홍길동"}); // 한 개를 넘겨줄 때도 배열에 담아서 넘겨야 한다.
  }
}
