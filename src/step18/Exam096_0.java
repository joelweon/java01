package step18;

import java.io.File;
import java.io.FileInputStream;

public class Exam096_0 {
  public static void main(String[] args) throws Exception {
    //파일을 덮어쓰지 않음
    FileInputStream in = new FileInputStream("temp/Exam095_0.data");

    int b = in.read();   //1바이트 읽기
    int b2 = in.read();
    int b3 = in.read();

    System.out.printf("%x, %x, %x\n", b, b2, b3);

    in.close();
  }
}