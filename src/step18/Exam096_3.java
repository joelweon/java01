package step18;

import java.io.File;
import java.io.FileInputStream;

public class Exam096_3 {
  public static void main(String[] args) throws Exception {
    FileInputStream in = new FileInputStream("temp/Exam095_3.data");

    //read()의 리턴 타입은 int 이지만 무조건 1바이트 읽는다. 
    System.out.printf("%x\n", in.read());
    System.out.printf("%x\n", in.read());
    System.out.printf("%x\n", in.read());
    System.out.printf("%x\n", in.read());

    in.close();
  }
}