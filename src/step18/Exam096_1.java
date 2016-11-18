package step18;

import java.io.File;
import java.io.FileInputStream;

public class Exam096_1 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/Exam095_1.data");
                                               //경로를 직접주기.
    int b = in.read();
    int b2 = in.read();
    int b3 = in.read();

    System.out.printf("%x, %x, %x\n", b, b2, b3);

    in.close();
  }
}