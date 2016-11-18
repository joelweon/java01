package step18;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Exam096_8 {

  static class DataInputStream extends FileInputStream {
    
    public DataInputStream(String path) throws FileNotFoundException {
      super(path);
    }

    public String readUTF() throws IOException{
      int len = this.read() << 8;
      len += this.read();

      byte[] buf = new byte[1024];
      this.read(buf, 0, len);
      String name = new String(buf, 0, len, "utf8");
      return name;
    }

    public int readInt() throws IOException {
      int value = this.read() << 24;
      value += this.read() << 16;
      value += this.read() << 8;
      value += this.read();
      return value;
    }
    
    public boolean readBoolean() throws IOException {
      return this.read() == 1 ? true : false;
    }
  }


  public static void main(String[] args) throws Exception {
    DataInputStream in = new DataInputStream("temp/Exam095_8.data");

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