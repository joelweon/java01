package step18;

import java.io.File;
import java.io.FileOutputStream;

public class Exam095_6 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/Exam095_6.data");

    String str = "ABCabc012가각간똘똠똥";

    byte[] bytes = str.getBytes("UTF-8");
    out.write(bytes);

    out.close();
  }
}