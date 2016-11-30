/* 연산자 인터페이스
 * => "인터페이스"란 사용자와 피사용자 사이의 호출 규칙
 * => 연산자 역할을 할 클래스가 반드시 가져야할 메서드 규칙
 * => 이 클래스를 사용하는 쪽에서는 이 인터페이스에 정의된 규칙에 따라
 *    메서드를 호출할 것이다.
*/
package patterns.command.v2;

public interface Operator {
//  규칙을 만드는 조건들
//  조건1)
//   - 호출할 메서드의 규칙을 정의하는 것이기 떄문에, 메서드 시그니처만 선언한다.
//   - "method signature"? 메서드명, 리턴타입, 파라미터를 말함.
//  조건2)
//   - 무조건 public이다. 왜? 규칙은 공개되어야 하기 때문에.
//   - 아무것도 안적으면 자동으로 public 이 붙는다.
//  조건3)
//   - 메서드를 구현해서는 안된다. 규칙은 단지 규격만 정하는 것이기 때문이다.
//   - 그래서 추상 메서드이다. "abstract"를 붙이지 않으면 컴파일할 때 자동으로 붙는다. 
  
  /*public abstract*/ int execute(int a, int b);
}