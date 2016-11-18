package step19;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.IOException;

public class Exam101_2 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("src/basic/Exam001.java");
    InputStreamReader adapter = new InputStreamReader(in,"UTF-8");
    LineNumberReader in2 = new LineNumberReader(adapter);

    String line;
    while ((line = in2.readLine()) != null) {
      System.out.printf("%d: %s\n", in2.getLineNumber(), line);
    }

    in2.close();
    adapter.close();
    in.close();
  }
}
// 파일은 utf8로 저장이 되고
// 