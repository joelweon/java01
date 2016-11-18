package step18;

import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Exam099_1 {

  static absract class FilterInputStream extends InputStream {
    protected InputStream in;

    // public FilterInpurStream() {} 기본생성자 못만들게 밑에서 막음.
    // 그래서 개발자에게 InputStream을 받도록 강제함.

    public FilterInputStream(InputStream in) {
      this.in = in;
    }

    @Override
    public int read() throws IOException {
      return -1;
    }
  }//FilterInputStream


  static class BufferedInputStream extends FilterInputStream {
    byte[] buf = new byte[8192];
    int length;
    int cursor;

    public BufferedInputStream(InputStream in) {
      super(in);
    }

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
  }//BufferedInputStream


  static class DataInputStream extends FilterInputStream {
    public DataInputStream(InputStream in) {
      super(in);
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
  }// DataInputStream


  public static void main(String[] args) throws Exception {
    FileInputStream in0 = new FileInputStream("temp/Exam095_10.data");
    BufferedInputStream in1 = new BufferedInputStream(in0);
    DataInputStream in = new DataInputStream(in1);

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
