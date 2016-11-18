package step17;
import java.util.Map.Entry;
import java.util.*;

public class Exam092_1 {
  public static void main(String[] args) {
    HashMap<String,String> map = new HashMap<>();
    map.put("s001", "홍길동");
    map.put("s002", "임꺽정");
    map.put("s003", "유관순");
    map.put("s004", "안중근");
    map.put("s005", "윤봉길");

    Set<String> keyList = map.keySet();

    for (String key : keyList) {
      System.out.printf("%s=%s\n", key, map.get(key));
    }

  }
}