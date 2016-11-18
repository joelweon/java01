// 주제: 람다 문법 맛보기
package step18.ex3;

public class Test1 {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.add("홍길동");
    list.add("임꺽정");
    list.add("유관순");
    list.add("안중근");
    list.add("윤봉길");

    // class MyConsumer implements Consumer {
    //   public void execute(int index, Object value) {
    //     System.out.printf("%d => %s\n", index, (String)value);
    //   }
    // }
    // list.forEach(new MyConsumer());

    //lambda 문법을 이용하여 계약서를 준수하는 클래스 및 인스턴스를 자동생성
    list.forEach((i, v) ->
      System.out.printf("%d *** %s\n", i, v));
    //ㄴ얘는 위의 단축 문법이다.
  }
}
/*
람다=> 메소드 하나짜리 계약서의 클래스를 작성할 때 쓴다.
*/