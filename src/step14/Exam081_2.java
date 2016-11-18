package step14;

import java.io.*;

public class Exam081_2{

  static void m1() throws FileNotFoundException {
     throw new FileNotFoundException("예외1");
  }

  static void m2() throws EOFException {
      throw new EOFException("예외2");
  }

  static void m3() throws IOException {
    throw new IOException("예외3");
  }

  static void m4() throws Exception {
    throw new Exception("예외4");
  }


  public static void main(String[] args) {
    //컴파일 오류. -> 순서가 중요하다.
    try {
      m1(); m2(); m3(); m4();
    } catch (IOException e) {          //already been caught
    } catch (FileNotFoundException e) {// X
    } catch (EOFException e) {         // X
    } catch (Exception e) {
    }


  }
}


