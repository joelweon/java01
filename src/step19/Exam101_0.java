package step19;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Exam101_0 {
  public static void main(String[] args) throws Exception {
    FileReader in = new FileReader("src/basic/Exam001.java");
    BufferedReader in2 = new BufferedReader(in);

    String line;
    while ((line = in2.readLine()) != null) {
      System.out.println(line);
    }

    in2.close();
    in.close();
  }
}