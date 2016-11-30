/* 주제: 리플랙션 API 사용법 - 클래스 로딩
 * 1) 스태틱 멤버(변수, 메서드)를 사용할 때
 * 2) new 명령을 사용하여 인스턴스를 생성할 때
 * 3) Class.forName()을 사용하려 클래스 로딩할 떄   -> 강제적인 클래스 로딩
 * */
package step24;

public class ClassTest01 {
  static class MyClass {
    static int a;
    static void m() {}
    
    static {  //클래스가 로딩 될 때 실행된다.
      System.out.println("MyClass 스태틱 블록 실행.");
    }
  }
  public static void main(String[] args) throws ClassNotFoundException {
//    단순히 참조변수를 만들 떄는 클래스가 로딩되지 않는다.
    MyClass obj = null;
//    1) 스태틱 멤버(변수,메서드를 사용할 때)
//    - 변수 사용
//    MyClass.a = 200; // 클래스 로딩 OK!
    
//    - 메서드 사용
//    MyClass.m(); // 클래스 로딩 OK!
    
//    2) new 명령을 사용하여 인스턴스를 생성할 때
//    System.out.println("-------------");
//    obj = new MyClass(); // 클래스 로딩 OK!
//    obj = new MyClass(); // 한번 클래스가 로딩되면 다시 로딩되지 않는다.
    
//    3) Class.forName()을 사용하려 클래스 로딩할 떄
//    Class.forName("MyClass");  //같은 패키지 안따짐.   
//    Class.forName("step24.MyClass"); //패키지 멤버 클래스가됨.
    Class.forName("step24.ClassTest01$MyClass"); // 클래스 로딩 OK!
    Class.forName("step24.ClassTest01$MyClass"); // 한번 클래스가 로딩되면 다시 로딩되지 않는다.
  }
}

/* 도구 사용법.
 * 수준 높은 코드를 짤 때 사용.*/
