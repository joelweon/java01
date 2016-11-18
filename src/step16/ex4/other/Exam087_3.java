package step16.ex4.other;

import step16.ex4.*;

public class Exam087_3 extends Exam087_0 {
  public static void main(String[] args) {
    Exam087_0 obj = new Exam087_0();  //=> 남의 메모리.
    //obj.v1 = 1000;    //private은 다른 클래스에서 접근 불가
    //obj.v2 = 2000;    //같은 패키지 접근 가능
    //obj.v3 = 3000;    //같은 패키지 + 자손 클래스 접근 가능
    obj.v4 = 4000;    //All pass

    Exam087_3 obj2 = new Exam087_3();
    //obj2.v1 = 1000;    //private은 다른 클래스에서 접근 불가
    //obj2.v2 = 2000;    //같은 패키지 접근 가능
    obj2.v3 = 3000;      //OK! 같은 패키지 + 자손 클래스 접근 가능
    obj2.v4 = 4000;      //All pass
  }
}