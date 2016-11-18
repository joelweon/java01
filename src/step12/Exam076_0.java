package step12;

public class Exam076_0 {
  static class A {}
  static class B {
    @Override
    public String toString() {
      return "이것은 Object를 테스트 하는 클래스입니다.";
    }
  }
  public static void main(String[] args) {
    A obj1 = new A();
    A obj2 = new A();
    System.out.println(obj1.toString());
    System.out.println(obj2.toString());

    B obj3 = new B();
    System.out.println(obj3.toString());

  }

}
//step12.Exam076_0$A@6d69c -> 인스턴스 식별번호.
// 패키지명...클래스명@인스턴스식별번호
