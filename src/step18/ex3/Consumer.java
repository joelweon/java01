package step18.ex3;

public interface Consumer {
  //계약서 규칙을 정의할 떄 메서드 시그너쳐(signature: 리턴타입, 메서드명, 파라미터)
  //만 선언해야한다. 
  //다음 규칙의 내용은 무엇인가?
  //LinkedList에서 반복문을 사용하여 목록을 꺼낼 때 마다
  //다음 규칙으로 된 메서드를 호출할 것이다.
  void execute(int index, Object value);
}