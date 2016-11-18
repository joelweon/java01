package step17;

import java.util.*;

public class Exam091_1 {
  static class MyKey {
    String value1;
    int value2;

    public MyKey(String value1, int value2) {
      this.value1 = value1;
      this.value2 = value2;
    }
  }
  public static void main(String[] args) {
    HashMap<MyKey, String> map = new HashMap<>();

    MyKey key1 = new MyKey("오호라", 100);
    MyKey key2 = new MyKey("오호라", 100);

    System.out.printf("%d, %d, %b\n",
      key1.hashCode(), key2.hashCode(), key1.equals(key2));

    map.put(key1, "홍길동");
    System.out.println(map.get(key1));
    System.out.println(map.get(key2));
    


  }
}
/*
*/