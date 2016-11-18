
package step11;

public class Exam073_2 {
  static class A {
    int v1;
    void m1(String value, int value2) {
      System.out.println("A.m1()");
    }
    void m2() {
      System.out.println("A.m2()");
    }
  }

  static class B extends A {
    int v2;
    void m1(String value2, int value) { //오버라이딩
      System.out.println("B.m1()");
    void m3() {
      System.out.println("B.m3()");
    }

    }
  }



  public static void main(String[] args) {
    A obj2 = new A();
    obj2.m1("2000", 2000);
    obj2.m2();
    System.out.println("----------------------");

    B obj = new B();
    obj.m1("2000", 2000);  //B의 메서드 호출 (오버라이딩함.)
    obj.m2();  //수퍼클래스 A의 m2() 메서드 호출
    obj.m3();  //B의 메서드 호출
    System.out.println("----------------------");


    //이 예제의 해심.
    A obj3 = new B();  // ??  B의 m1()메서드가 호출된다!
    obj3.m1("2000", 2000); //A의 m2() 메서드가 호출된다.
    obj3.m2();  //A의 m2()  메서드가 호출
    //obj3.m3(); //오류 그렇다고 m3의 A의 메서드를 호출 할 수 는 없다.  
    //m3()는 A의 메서드가 아니다.

    System.out.println("----------------------");

  }
}
