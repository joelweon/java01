//주제: class members - instance변수, method, constructor, block, inner class

package step16.ex3;

class Exam086_0 {
  //1) 멤버 변수

  //  =>스태틱변수 : static 키워드가 붙어서
  //  =>클래스변수 : 클래스가 로딩될 때 자동 생성되는 변수라고 해서.
  static int v1;
  
  // => 인스턴스 변수 : 인스턴스를 생성할 때 만드는 변수라고 해서.
  int v2;

  //2) 멤버 메서드
  //  => 스태틱 메서드 또는 클래스 메서드라 부른다.
  static void m1() {}

  //3) 생성자
  public Exam086_0() {}

  //4) 스태틱 블록
  static {
    //클래스 변수 초기화
  }

  //5) 인스턴스 블록
  {
    //인스턴스 변수 초기화
  }

  //6) 중첩 글래스
  class My{}
  
}