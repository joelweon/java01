package step18;

import java.io.File;
import java.io.FileOutputStream;

public class Exam095_4 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/Exam095_4.data");

    byte[] buf = {0x11,0x22,0x33,0x44,0x55,0x66,0x78,0x79,0x7a};

    out.write(buf);

    out.close();
  }
}