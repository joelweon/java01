package step19;

import java.io.FileOutputStream;
import java.io.IOException;

public class Exam100_0 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/Exam100_0.data");
    
    String str = "ABCabc012가각간";

    // byte[] bytes = str.getBytes("UTF-16");
    byte[] bytes = str.getBytes("UTF-8");
    
    out.write(bytes);
    out.close();
  }
}