package step17;

import java.util.*;

public class Exam091_2 {
  static class MyKey {
    String value1;
    int value2;

    public MyKey(String value1, int value2) {
      this.value1 = value1;
      this.value2 = value2;
    }

    @Override
    public int hashCode() {
/*    String value = String.format("%s,%d", this.value1, this.value2);
      return value.hashCode();
*/
      return String.format("%s,%d", this.value1, this.value2).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) return true;
      if (!(obj instanceof MyKey)) return false;
      MyKey other = (MyKey)obj;
      if (!this.value1.equals(other.value1)) return false;
      if (this.value2 != other.value2) return false;
      return true;
    }
  }
  //내가 쓰고싶은 MyKey를 하려면 오버라이드 해야한다.
  //
  public static void main(String[] args) {
    HashMap<MyKey, String> map = new HashMap<>();

    MyKey key1 = new MyKey("오호라", 100);
    MyKey key2 = new MyKey("오호라", 100);

    System.out.printf("%d, %d, %b\n", key1.hashCode(), key2.hashCode(), key1.equals(key2));

    map.put(key1, "홍길동");
    System.out.println(map.get(key1));
    System.out.println(map.get(key2));

/* 다음 코드는 컴파일 오류 -> for (:)에 들어갈 값은 배열 or java.util.Iterable
    for (String value : map) {
      System.out.println(value);
    }
    */
  }
}