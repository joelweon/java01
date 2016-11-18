package step18;

import java.io.File;
import java.io.FileInputStream;

public class Exam096_5 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/Exam095_5.data");

    byte[] buf = new byte[1024];

    int len = in.read(buf, 10, 100);

    for (int i = 10; i < len + 10; i++) {
      System.out.printf("%x, ", buf[i]);
    }
    System.out.println();

    in.close();
  }
}