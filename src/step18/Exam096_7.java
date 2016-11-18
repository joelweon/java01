package step18;

import java.io.File;
import java.io.FileInputStream;

public class Exam096_7 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/Exam095_7.data");

    String name = null;
    int kor = 0;
    int eng = 0;
    int math = 0;
    int sum = 0;
    boolean working = false;

    int len = in.read() << 8;  //1바이트를 읽음. read가 리턴하는 건 4바이트 int 값임.
    len += in.read();
    System.out.println(len);

    byte[] buf = new byte[1024];
    in.read(buf, 0, len);
    name = new String(buf, 0, len, "utf8");
    kor = in.read() << 24;
    kor += in.read() << 16;
    kor += in.read() << 8;
    kor += in.read();

    eng = in.read() << 24;
    eng += in.read() << 16;
    eng += in.read() << 8;
    eng += in.read();

    math = in.read() << 24;
    math += in.read() << 16;
    math += in.read() << 8;
    math += in.read();

    sum = in.read() << 24;
    sum += in.read() << 16;
    sum += in.read() << 8;
    sum += in.read();

    working = in.read() == 1 ? true : false;

    System.out.printf("%s, %d, %d, %d, %d, %b\n", name, kor, eng, math, sum, working);

    in.close();
  }
}