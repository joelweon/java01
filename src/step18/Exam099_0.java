// 연관(association) => 단순히 사용하는 관계.  (상속x)
// 기능을 뗐다 붙였다 하는 구조를 데코레이터 패턴이라함.
package step18;

import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Exam099_0 {

  //  데코레이터(FilterInputStream) 역할을 할 클래스(장식품의 역할)
  static class BufferedInputStream extends InputStream {
    InputStream in;
    byte[] buf = new byte[8192];
    int length;
    int cursor;
                              
    public BufferedInputStream(InputStream in) {
      this.in = in;
    }

    @Override
    public int read() throws IOException{
      System.out.println("BufferedInputStream.read()...");
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
  }// BufferedInputStream

  static class DataInputStream extends InputStream {
    InputStream in;
    
    public DataInputStream(InputStream in) {
      this.in = in;
    }

    @Override
    public int read() throws IOException {
      return -1;
    }

    public String readUTF() throws IOException{
      int len = in.read() << 8;
      len += in.read();
      byte[] buf = new byte[1024];
      in.read(buf, 0, len);
      String name = new String(buf, 0, len, "utf8");
      return name;
    }

    public int readInt() throws IOException {
      int value = in.read() << 24;
      value += in.read() << 16;
      value += in.read() << 8;
      value += in.read();
      return value;
    }
    
    public boolean readBoolean() throws IOException {
      return in.read() == 1 ? true : false;
    }

    public void close() throws IOException {
      in.close();
    }
  // DataInputStream



  public static void main(String[] args) throws Exception {
    FileInputStream in0 = new FileInputStream("temp/Exam095_10.data");
    DataInputStream in1 = new DataInputStream(in0);
    BufferedInputStream in = new BufferedInputStream(in1);
    // BufferedInputStream in1 = new BufferedInputStream();
    // buffer는 기본생성자가 없다.                     ㄴ오류
    

    String name = null;
    int kor = 0;
    int eng = 0;
    int math = 0;
    int sum = 0;
    boolean working = false;

    name = in.readUTF();
    kor = in.readInt();
    eng = in.readInt();
    math = in.readInt();
    sum = in.readInt();
    working = in.readBoolean();

    System.out.printf("%s, %d, %d, %d, %d, %b\n", name, kor, eng, math, sum, working);

    in.close();
  }
}