package step11;

public class Exam074_0 {
  static class A {
    int result;
    void plus(int value) {
      result += value;
    }
  }

  static class B extends A {
    void minus(int value) {
      result -= value;
    }
    // 수퍼 클래스의 메서드와 기능이 같고
    // 이름이 같은 메서드를 추가한다. => 오버로딩이다.
    void plus(int value1, int value2) {
      this.result += value1 + value2;
    }

    void minus(int value1, int value2) {
      result -= value1 - value2;
    }
  }



  public static void main(String[] args) {
    B obj = new B();
    obj.plus(10);  //A.plus() 호출
    obj.plus(10, 20);  //B.plus();
    obj.minus(10);
    obj.minus(10, 20);
    obj.minus(10, 20, 30);


  }
}
