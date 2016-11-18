package step18;

import java.io.File;
import java.io.FileOutputStream;

public class Exam095_3 {
  public static void main(String[] args) throws Exception {
    FileOutputStream out = new FileOutputStream("temp/Exam095_3.data");

    //write()의 파라미터는 int 이지만 출력은 맨 끝 1바이트만 출력한다.
    int value = 0xaa_bb_cc_dd;
    out.write(value >> 24);
    out.write(value >> 16);
    out.write(value >> 8);
    out.write(value);
    
    System.out.printf("%x\n", value);



    out.close();
  }
}