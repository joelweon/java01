//스레드 적용전
package step20;

public class Exam106_0 {
  static class MyObject {
    public void m() {
      for (int i= 0; i< 5000; i++) {
        System.out.printf("MyObject(%d)\n", i);
      }
    }
  }
  public static void main(String[] args) throws Exception {
    MyObject obj = new MyObject();
    
//    다음 메서드는 일반 객체의 메서드이기 때문에 현재 "main" 메서드가 실행하는 main스레드 가 실행한다.
//    m() 메서드메서드가 실행을 마쳐야만 다음 반복문을 실행할 수 있다.
    obj.m();  
    
    for (int i= 0; i< 5000; i++) {
      System.out.printf("main(%d)...\n", i);
    }
    
    
  }
}
