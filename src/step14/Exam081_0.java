package step14;

import java.io.*;

public class Exam081_0{

  static void m1(int a) throws Exception, IOException, EOFException, FileNotFoundException {
    if (a == 0) 
      throw new FileNotFoundException("예외1");
    else if (a == 1) 
      throw new EOFException("예외2");
    else if  (a == 2)
      throw new IOException("예외3");
    else
      throw new Exception("예외4");
  }

  static void m2(int a) throws Exception, IOException {
    if (a == 0) 
      throw new FileNotFoundException("예외1");
    else if (a == 1) 
      throw new EOFException("예외2");
    else if  (a == 2)
      throw new IOException("예외3");
    else
      throw new Exception("예외4");
  }

  static void m3(int a) throws Exception {
    if (a == 0) 
      throw new FileNotFoundException("예외1");
    else if (a == 1) 
      throw new EOFException("예외2");
    else if  (a == 2)
      throw new IOException("예외3");
    else
      throw new Exception("예외4");
  }
/*
  static void m3(int a) throws Object {
    if (a == 0) 
      throw new FileNotFoundException("예외1");
    else if (a == 1) 
      throw new EOFException("예외2");
    else if  (a == 2)
      throw new IOException("예외3");
    else
      throw new Exception("예외4");
  }
*/

  public static void main(String[] args) {
    
  }
}


