package step17;

import java.util.*;

public class Exam090_4 {
  public static void main(String[] args) {
    HashSet<Customer> set = new HashSet<>();
    set.add(new Customer("홍길동", 20 , false));
    set.add(new Customer("홍길동", 20 , false));
    set.add(new Customer("홍길동", 20 , false));

    for (Customer customer : set) {
      System.out.println(customer);
    }
    System.out.println("---------------------");
  
    HashSet<Customer2> set2 = new HashSet<>();
    set2.add(new Customer2("홍길동", 20 , false));
    set2.add(new Customer2("홍길동", 20 , false));
    set2.add(new Customer2("홍길동", 20 , false));

    for (Customer2 customer : set2) {
      System.out.println(customer);
    }  
  }
}
/*

*/