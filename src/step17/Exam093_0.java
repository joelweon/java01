package step17;
import java.util.*;

public class Exam093_0 {
  public static void main(String[] args) {
    HashMap<String,String> map = new HashMap<>();
    map.put("s001", "홍길동");
    map.put("s002", null);
    map.put(null, "유관순");
    map.put("s004", "안중근");
    map.put("s005", "윤봉길");
    System.out.println(map.get("s002"));
    System.out.println(map.get(null));
    System.out.println("---------------------");

    Hashtable<String,String> map2 = new Hashtable<>();

    map2.put("s001", "홍길동");
    //map2.put("s002", null);
    //map2.put(null, "유관순");
    map2.put("s004", "안중근");
    map2.put("s005", "윤봉길");
    System.out.println(map2.get("s002"));
    //System.out.println(map.get(null));      
    
  }
}