package step18;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Exam095_8 {

  static class DataOutputStream extends FileOutputStream {

    public DataOutputStream(String path) throws FileNotFoundException {
      super(path);
    }

    public void writeUTF(String str) throws IOException{
      this.write(bytes.length >> 8);
      this.write(bytes.length);
      byte[] bytes = str.getBytes("utf8");
      this.write(bytes);
    }

    public void writeInt(int value) throws IOException {
      this.write(value >> 24);
      this.write(value >> 16);
      this.write(value >> 8);
      this.write(value);
    }
    
    public void writeBoolean(boolean value) throws IOException {
      this.write(value ? 1 : 0);
    }
  }


  public static void main(String[] args) throws IOException {
    DataOutputStream out = new DataOutputStream("temp/Exam095_8.data");

    String name = "홍길동";
    int kor = 100;
    int eng = 90;
    int math = 100;
    int sum = kor + eng + math;
    boolean working = false;

    out.writeUTF(name);
    out.writeInt(kor);
    out.writeInt(eng);
    out.writeInt(math);
    out.writeInt(sum);
    out.writeBoolean(working);
    


    out.close();
  }
}