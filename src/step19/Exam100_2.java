package step19;

import java.io.FileWriter;
import java.io.IOException;

public class Exam100_2 {
  public static void main(String[] args) throws Exception {
    FileWriter out = new FileWriter("temp/Exam100_2.data");
    
    String str = "ABCabc012가각간";

    char[] chars = str.toCharArray();

    out.write(chars, 0, chars.length);
    out.close();
  }
}