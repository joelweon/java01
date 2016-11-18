package step18;

import java.io.File;
import java.io.FileInputStream;

public class Exam096_4 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/Exam095_4.data");

    byte[] buf = new byte[1024];

    int len = in.read(buf); // 리턴 값은 읽은 바이트 수

    for (int i = 0; i < len; i++) {
      System.out.printf("%x, ", buf[i]);
    }
    System.out.println();
    in.close();
  }
}