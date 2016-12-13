package step27.client;

import step27.server.CalculatorStub;

public class TestClient {
  public static void main(String[] args) {
//    다른 JVM(다른 프로세스)에서 생성한 객체를 호출하고 싶다.
//    어떻게?
//    Calculator calc = new Calculator();
    
//    클라이언트 쪽에서는 서버에 있는 Caculator 객체를 직접 호출하는 대신
//    그 객체의 대행자인 CalculatorStub을 마치 서버 객체를 호출하는 것처럼 사용한다. 
    CalculatorStub calc = new CalculatorStub();
    System.out.println(calc.plus(10,20));
    System.out.println(calc.minus(10,20));
  }
}


/* 기업용 인사관리 시스템과 회계관리 시스템이 있는데 
 * 인사가 회계에 있는 메서드를 호출할 수 없다.
 * (다른 컴퓨터에 있는)
 * 그러면 방법은? 통신하는 방법 밖에 없다.
 * */