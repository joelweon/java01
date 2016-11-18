package step18;

import java.io.File;
import java.io.FileInputStream;

public class Exam096_6 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/Exam095_6.data");

    byte[] buf = new byte[1024];
    int len = in.read(buf);

    String str = new String(buf, 0, len, "utf8");
    
    System.out.println(str);

    in.close();
  }
}