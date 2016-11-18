package step19;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Exam103_3 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/Exam103_3.data");
    ObjectOutputStream out2 = new ObjectOutputStream(out);

    out2.writeObject(new Score("홍길동", 100, 100, 100));
    out2.writeObject(new Score("임꺽정", 90, 90, 90));
    out2.writeObject(new Score("유관순", 80, 80, 97));

    out2.close();
    out.close();
    
    System.out.println("출력 완료!");
  }
}