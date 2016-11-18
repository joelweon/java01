package step18;

import java.io.File;
import java.io.FileOutputStream;

public class Exam095_0 {
  public static void main(String[] args) throws Exception {
    File file = new File("temp/Exam095_0.data");

    FileOutputStream out = new FileOutputStream(file);

    out.write(10);
    out.write(20);
    out.write(30);

    out.close();
  }
}