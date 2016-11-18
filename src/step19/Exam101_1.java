package step19;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Exam101_1 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("src/basic/Exam001.java");
    InputStreamReader adapter = new InputStreamReader(in, "UTF-8");
    BufferedReader in2 = new BufferedReader(adapter);

    String line;
    while ((line = in2.readLine()) != null) {
      System.out.println(line);
    }

    in2.close();
    adapter.close();
    in.close();
  }
}