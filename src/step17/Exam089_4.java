package step17;

import java.util.*;

public class Exam089_4 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    
    String name = "홍길동";
    list.add(name);
    list.add(name);
    list.add(name);
    list.add(name);
    list.add(name);
//같은주소

    for (Object ref : list) {
      //Object ref = list.get(i); -> 인덱스를 줄 필요가 없다.
      System.out.printf("%s => %s\n",
        ref.toString(), ref.getClass().getName());
    }
  }
}
/*
ArrayList는 데이터 중복을 허용한다.
*/