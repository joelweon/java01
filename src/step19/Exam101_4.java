package step19;

import java.io.FileReader;
import java.io.LineNumberReader;

public class Exam101_4 {
  public static void main(String[] args) throws Exception {
    FileReader in = new FileReader("temp/Exam101_3.data");
    LineNumberReader in2 = new LineNumberReader(in);

    String line;
    while ((line = in2.readLine()) != null) {
      String[] values = line.split(",");
      System.out.printf("%03d: %s(%d)\n", 
        in2.getLineNumber(), values[0], Integer.parseInt(values[1]));
    }
//readLine 엔터에서 끊음

    in2.close();
    in.close();
  }
}