package step16.ex6;

public class Test2 extends MyClass2 {
  @Override
  public void m2() {}
  
  /* final 메서드는 서브 클래스에서 재정의(Override)를 할 수 없다. (함부로 변경하지 못하게 하기 위함)
  @Override
  public void m1() {}
  */

}
