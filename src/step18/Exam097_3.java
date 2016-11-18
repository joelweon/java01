// 연관(association) => 단순히 사용하는 관계.  (상속x)
package step18;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Exam097_3 {
  static class BufferedInputStream {
    FileInputStream in;
    byte[] buf = new byte[8192];
    int length;
    int cursor;

    public BufferedInputStream(FileInputStream in) {
      this.in = in;
    }

    public int read() throws IOException{
      if (cursor == length) {
        length = in.read(buf);
        cursor = 0;
        if (length == -1) 
          return -1;
      }

      return buf[cursor++] & 0x000000FF;
    }
    
    public void close() throws IOException {
      in.close();
    }
  }


  public static void main(String[] args) throws Exception {
    FileInputStream in0 = new FileInputStream("temp/jls8.pdf");
    BufferedInputStream in = new BufferedInputStream(in0); //생성자를 만들었다.
    //b가 f를 상속을 하지않고 기능을 확장하는 구조 

    long startMillis = System.currentTimeMillis();

    int count = 0;

    while (in.read() != -1) count++;

    long endMillis = System.currentTimeMillis();

    System.out.printf("%d: %d\n", count, endMillis - startMillis);

    in.close();
  }
}