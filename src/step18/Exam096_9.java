package step18;

import java.io.File;
import java.io.FileInputStream;

public class Exam096_9 {
  public static void main(String[] args) throws Exception {
    //파일을 덮어쓰지 않음
    FileInputStream in = new FileInputStream("temp/Exam095_9.data");

    System.out.printf("%1$d(%1$x)\n", in.read());
    System.out.printf("%1$d(%1$x)\n", in.read());
    

    in.close();
  }
}