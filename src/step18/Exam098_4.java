// 5) 의존
package step18;

import java.io.File;
import java.io.FileInputStream;


public class Exam098_4 {
  static class GasStation {}

  static class Car {
    public void injectOil(GasStation gasStation) {

    }
  }

  public static void main(String[] args) throws Exception {
    GasStation g1 = new GasStation();

    Car car = new Car();
    car.injectOil(g1);
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