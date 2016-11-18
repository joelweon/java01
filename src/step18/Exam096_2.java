//FileInputStream 
package step18;

import java.io.File;
import java.io.FileInputStream;

public class Exam096_2 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/Exam095_2.data");

    //read()의 리턴타입은 int 이지만 무조건 1qkdlxm dlfrsmsek.
    int b = in.read();

    System.out.printf("%x\n",b);

    in.close();
  }
}