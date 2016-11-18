package step17;

import java.util.*;

public class Exam090_3 {
  public static void main(String[] args) {
    // HashSet<String> set = new HashSet<String>();
    HashSet<String> set = new HashSet<>(); //jdk7은 이렇게 생략가능. 
    set.add(new String("홍길동"));
    set.add(new String("홍길동"));
    set.add(new String("홍길동"));


    for (String name : set) {
      System.out.println(name);
    }

    System.out.println("---------------------");
    HashSet<Customer> set2 = new HashSet<Customer>();
    set2.add(new Customer("홍길동", 20 , false));
    set2.add(new Customer("홍길동", 20 , false));
    set2.add(new Customer("홍길동", 20 , false));

    for (Customer customer : set2) {
      System.out.println(customer);
    }
  }
}
/*
HashSet은 값을 저장 할 때 
따라서 해기 값이 같으면 같은 위치에 저장한다.
그래서 중복된 값이 저장되는 것이 아니다.
=> 데이터 중복의 기준은 hashCode()의 리턴 값이다.
String 클래스는 같은 문자열에 대해 같은 해시 값을 리턴하도록
hashCode() 메서드
그래서 String 은 인스턴스가 다르더라고 문자열이 같으면
같은 해시값을 리턴하도록 프로그램 했기 때문에,
같은 문자열이 중복저장되지 않는다.
그에반해 , Customer 클래스는 hashCode()를 재정의 하지 않았다.
즉 무조건 인스턴스에 저장된 값에 상관없이 다른 해시값을 리턴한다.
그래서 Customer클래스는 인스턴스에 저장된 값이 같더라도 인스턴스가 다르면
*/