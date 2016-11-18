package step18;

import java.io.File;
import java.io.FileInputStream;


public class Exam097_0 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/jls8.pdf");

    long startMillis = System.currentTimeMillis();

    int count = 0;
    while (in.read() != -1) count++;

    long endMillis = System.currentTimeMillis();

    System.out.printf("%d: %d\n", count, endMillis - startMillis);

    in.close();
  }
}