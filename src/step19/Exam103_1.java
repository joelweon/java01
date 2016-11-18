package step19;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;


public class Exam103_1 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/Exam103_1.data");
    ObjectOutputStream out2 = new ObjectOutputStream(out);

    Student2 s1 = new Student2("홍길동", 20, true);
    Student2 s2 = new Student2("임꺽정", 30, false);
    Student2 s3 = new Student2("유관순", 40, true);
    Student2 s4 = new Student2("안중근", 50, true);

    out2.writeObject(s1);
    out2.writeObject(s2);
    out2.writeObject(s3);
    out2.writeObject(s4);
    

    out2.close();
    out.close();
  }
}