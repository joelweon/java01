/*
1) Data Sink Stream 클래스
 - 직접 데이터를 읽고 쓰는 클래스
 - 예) 
    파일     => File InputStream/FileOutputStream
             => FileReader / FileWriter
    메모리   => ByteArrayInputStream/ByteArrayOutputStream
                CharArrayReader/CharArrayWriter
                StringReader/StringWriter
    다른 프로그램의 출력 결과 => pipedInputSream
2) Data processing Stream 클래스 = 데코레이터
 - 다른 스트림 객체를 이용하여 중간에서 데이터를 처리하는 작업을 수행.

*/
package step18;

import java.io.File;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.BufferedInputStream;
import java.io.DataInputStream;

public class Exam099_1 {

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
