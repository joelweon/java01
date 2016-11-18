// 3) 집합
package step18;

import java.io.File;
import java.io.FileInputStream;


public class Exam098_2 {
  static class Mouse {}
  static class USBMemory {}
  static class Computer {
    Mouse mouse;
    USBMemory[] usbs;
  }

  public static void main(String[] args) throws Exception {
    Mouse mouse = new Mouse();
    USBMemory[] memories = {new USBMemory(), new USBMemory(), new USBMemory()};
    Computer computer = new Coumputer();
    computer.mouse = mouse;
    computer.usbs = memories;
  }
}
/*
클래스 사이의 관계
1) 상속(ingeritance)
  => 수퍼클래스와 서브 클래스의 관계
2) 연관()
  => 
3) 집합(aggregation)
  => 개념적으로 포함하는 관계. container 와 containee 의 생명주기가 다르다.
  => 
4) 복합(composition)
  => 개념적으로 포함하는 관계.
5) 의존()
  => 메서드가 호출될 때 잠시 사용하는 관계