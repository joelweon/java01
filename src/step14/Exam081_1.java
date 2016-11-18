package step14;

import java.io.*;

public class Exam081_1{

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
    //try 블록 안에서 발생되는 모든 예외를 개별적으로 받을 수 있다.
    try {
      m1(); m2(); m3(); m4();
    } catch (FileNotFoundException e) {
    } catch (EOFException e) {
    } catch (IOException e) {
    } catch (Exception e) {
    }

    //입출력합치기
    try {
      m1(); m2(); m3(); m4();
    } catch (IOException e) {
    } catch (Exception e) {
    }
    //다 합치기
    try {
      m1(); m2(); m3(); m4();
    } catch (Throwable e) {
    }
/*
    try {
      m1(); m2(); m3(); m4();
    } catch (Object e) {  //Object는 오류.
    }    
*/

  }
}


