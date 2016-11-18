package step17;

import java.util.*;

public class Exam090_2 {
  public static void main(String[] args) {
    HashSet<String> set = new HashSet<String>();

    set.add("홍길동");
    set.add("임꺽정");
    set.add("유관순");
    set.add("안중근");
    set.add("윤봉길");
    set.add("홍길동");
    set.add("임꺽정");    

    for (String name : set) {
      System.out.println(name);
    }

//중복저장 원하면 -> ArrayList
    System.out.println("------------------------");
    ArrayList<String> list = new ArrayList<String>();

    list.add("홍길동");
    list.add("임꺽정");
    list.add("유관순");
    list.add("안중근");
    list.add("윤봉길");
    list.add("홍길동");
    list.add("임꺽정");    

    for (String name : list) {
      System.out.println(name);
    }
  }
}
/*
데이터 중복 불가!
왜?
set이기 때문이다. set-> 집합 => 집합의 특성상 중복을 허용하지 않는다.
*/