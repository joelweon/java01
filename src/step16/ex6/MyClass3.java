/* final 사용
*/
package step16.ex6;

public class MyClass3 {
//  변수에 final을 붙이면 값을 한 번만 할당 할 수 있다.
//  => 생성자에게 변수를 초기화 시키지 않는다면,
//     인스턴스 변수를 선언할 때 특정 값으로 초기화시키지 않으면
//     반드시 생성자에서 초기화 시켜야 한다.
//  final int a;
  final int b = 10;
  final int c;  //생성자에서 초기화시키기 때문에 OK!
  
//  생성자에서는 반드시  초기화시키지 않은 final 변수를 
//  반드시 초기화 시켜야 한다.
  public MyClass3() {
    this.c = 100; // 이 문장이 없으면 컴파일 오류.
  }
  
  public void m(final int p1, final int p2) {
//    로컬변수(파라미터 변수 포함)는 변수를 선언한 후
//    나중에 딱 한 번 초기화 시킬 수 있다.
    final int v1;
    v1 = 20;
    v1 = 30;  //두번때 부터는 오류이다. 
  }
}
