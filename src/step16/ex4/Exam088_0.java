
package step16.ex4;

// 바깥 클래스?
// => 패키지 멤버 클래스라 부른다.
// 안쪽 클래스?
// => 클래스 안에 소속된 클래스라고해서 "중첩 클래스"(inner class)라 부른다.
public class Exam088_0 {
  // 중첩 클래스는 바깥 클래스와 달리 private, protected 모두 사용가능!

  static class My1 {}
  class My2 {}

  private class My3 {}
  class My4 {}
  protected class My5 {}
  public class My6 {}

}