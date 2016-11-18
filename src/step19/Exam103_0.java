/* 주제: 객체 입출력 - ObjectOutputStream을 이용하여 인스턴스의 값을 출력하기
- 어떻게?
  인스턴스의 값을 바이트 배열로 만들어 출력한다. "직렬화(Serialization)"
                                                  -바이트 배열화
  직렬화(Serialization - marshaling) 
  - 인스턴스의 값을 바이트 배열로 만들어 출력하는 것.
  역직렬화(Deserialization - ummarshaling)
  - 바이트 배열을 인스턴스로 복원하는 것.

  주의!
  직렬화 허용하는 방법.
  - 클래스 선언부에 java.io.Serializable
  인스턴스의 값이 외부로 무조건 방출되는 것을 방지하기위해 =>  보완.

*/
package step19;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;


public class Exam103_0 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/Exam103_0.data");
    ObjectOutputStream out2 = new ObjectOutputStream(out);

    Student s1 = new Student("홍길동", 20, true);
    Student s2 = new Student("임꺽정", 30, false);
    Student s3 = new Student("유관순", 40, true);
    Student s4 = new Student("안중근", 50, true);

    out2.writeObject(s1);
    out2.writeObject(s2);
    out2.writeObject(s3);
    out2.writeObject(s4);
    

    out2.close();
    out.close();
  }
}