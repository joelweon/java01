package step18;

import java.io.File;
import java.io.FileInputStream;


public class Exam097_1 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/jls8.pdf");

    long startMillis = System.currentTimeMillis();

    int count = 0;
    byte[] buf = new byte[8192];
    while (in.read(buf) != -1) count++;

    long endMillis = System.currentTimeMillis();

    System.out.printf("%d: %d\n", count, endMillis - startMillis);

    in.close();
  }
}