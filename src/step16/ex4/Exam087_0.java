package step16.ex4;

public class Exam087_0 {
  private int v1;    //private은 다른 클래스에서 접근 불가
  int v2;            //같은 패키지 접근 가능
  protected int v3;  //같은 패키지 + 자손 클래스 접근 가능
  public int v4;     //All pass

  public void m1() {
    this.v1 = 100;
    this.v2 = 200;
    this.v3 = 300;
    this.v4 = 400;
    //this 없어도 되지만 알려주기위해 붙여줬음.
  }

}
//static 블록이나 인스턴스 블록은 접근 제어를 붙일 수 없다. public static {}