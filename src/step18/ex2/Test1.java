// 주제: 인터페이스 사용 후
package step18.ex2;

public class Test1 {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.add("홍길동");
    list.add("임꺽정");
    list.add("유관순");
    list.add("안중근");
    list.add("윤봉길");

    class MyConsumer implements Consumer {
      public void execute(int index, Object value) {
        System.out.printf("%d => %s\n", index, value);
      }
    }

    list.forEach(new MyConsumer());
    
  }
}
/*
forEach를 호출하면 만든 객체를 excute를 호출하게 되어있다.
컨슈머는 계약서를 준수하는 애라면 누구든 올 수 있다.

계약서를 이행하는 - 계약서에있는 메서드를 만든다.
값을 하나 꺼낼때마다 메서드 하나씩 호출된다.

계약서대로 값을 넣기만 하면된다.
*/