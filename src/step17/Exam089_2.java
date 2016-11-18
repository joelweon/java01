package step17;

import java.util.*;

public class Exam089_2 {
  public static void main(String[] args) {
    ArrayList list = new ArrayList();
    

    list.add("홍길동");
    list.add(10);
    list.add(3.14f);  
    list.add(new Score("임꺽정", 100, 100, 100));
    list.add(new Customer());

    for (Object ref : list) { //클래스 계약에 따른 것들은 다 쓸 수 있다.
      //Object ref = list.get(i); -> 인덱스를 줄 필요가 없다.
      System.out.printf("%s => %s\n",
        ref.toString(), ref.getClass().getName());
    }
  }
}



/*
ArrayList와 for(:) 문
=> for(변수선언 : 배열 또는 컬렉션 객체) -> string같은 것은 올 수 없다.(계약에 없는 것들)
=>
=> java.util.Collection 
- ArrayList, LinkedLlist, Vector, HashSet, Stack, PrioritQueue 등..
*/