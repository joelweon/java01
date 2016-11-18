package step17;

import java.util.*;

public class Exam089_3 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    //String만 올 수 있다.

    list.add("홍길동");
    //list.add(10);
    //list.add(3.14f);  
    //list.add(new Score("임꺽정", 100, 100, 100));
    //list.add(new Customer());

    for (Object ref : list) {
      //Object ref = list.get(i); -> 인덱스를 줄 필요가 없다.
      System.out.printf("%s => %s\n",
        ref.toString(), ref.getClass().getName());
    }
  }
}
/*
ArrayList는 제네릭을 지원한다.
=> 저장할 데이터의 타입을 지정하지 않으면, 모든 타입을 다룰 수 있다.
=> 제네릭 문법을 사용하여 저장할 데이터의 타입을 제한할 수 있다.
*/