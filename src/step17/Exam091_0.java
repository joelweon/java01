package step17;

import java.util.*;

public class Exam091_0 {
  public static void main(String[] args) {
    HashMap<String,String> map = new HashMap<>();

    // key 객체에 저장된 값이 같다면 해시값도 같아야 한다.
    // hashCode()와 equals()를 재정의한 클래스만 사용하라!
    // 예) String, Wrapper 클래스(Byte, Short, Integer, long, Float, Double, Character)  
    map.put("s001", "홍길동");
    map.put("s002", "임꺽정");
    map.put("s003", "유관순");
    map.put("s004", "안중근");
    map.put("s005", "윤봉길");

    String key = new String("s003");

    String value = map.get(key);

    System.out.println(value);


  }
}
/*
1) HashMap은 key or value에 null을 넣을 수 있다.
Hashtable은 null 값을 key or value에 넣을 수 없다.
2) 동기화 지원
  -HashMap은 동기화를 지원하지 않는다. 동시에 여러 스레드가 사용할 때
  값의 변경을 제어하지 않는다.
  Hashtable은 동기화를 지원한다.
semaphore.
*/