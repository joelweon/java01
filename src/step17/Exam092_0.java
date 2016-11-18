package step17;
import java.util.Map.Entry;
import java.util.*;

public class Exam092_0 {
  public static void main(String[] args) {
    HashMap<String,String> map = new HashMap<>();
    map.put("s001", "홍길동");
    map.put("s002", "임꺽정");
    map.put("s003", "유관순");
    map.put("s004", "안중근");
    map.put("s005", "윤봉길");


    //Set<Map.Entry> set = map.entrySet.();//내부적으로 키와 값이 들어있다.
    Set<Entry<String,String>> set = map.entrySet();

    for (Entry<String,String> entry : set) {
      System.out.printf("%s=%s\n", entry.getKey(), entry.getValue());
    }

  }
}
//순서를 보장하려면 Array에 담아야한다.
//키와 값을 꺼내는 방법(1)
