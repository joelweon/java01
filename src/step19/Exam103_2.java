package step19;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;


public class Exam103_2 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/Exam103_1.data");
    ObjectInputStream in2 = new ObjectInputStream(in);

    Student2 s = (Student2)in2.readObject();
    System.out.println(s);  //toString할 필요없다. print에 스트링이 아니면 자동
    System.out.println(in2.readObject());
    System.out.println(in2.readObject());
    System.out.println(in2.readObject());
    

    in2.close();
    in.close();
  }
}