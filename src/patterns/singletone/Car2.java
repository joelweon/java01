package patterns.singletone;

// Singleton 패턴 적용
//  => 인스턴스를 오직 한 개만 생성할 수 있도록 하는 설계 기법.
// 1) 모든 생성자를 private으로 선언한다.
// 2) 인스턴스를 생성해주는 static 메서드 추가.
public class Car2 {
  static Car2 obj;
  String name;
  String maker;
  int cc;
  
  private Car2() {}
  
  public static Car2 getInstance() {
    if (obj == null) {
      obj = new Car2();
    }
    return obj;
  }
}
