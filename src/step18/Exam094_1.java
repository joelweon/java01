package step18;

import java.io.File;

public class Exam094_1 {
  public static void main(String[] args) throws Exception{
    File f1 = new File("test.txt");
    boolean b = f1.exists();
    System.out.println(b);

    File f2 = new File("../intro/Hello.java");
    System.out.println(f2.exists());
    System.out.println(f2.getName());
    System.out.println(f2.getAbsoluteFile());
    System.out.println(f2.getCanonicalPath());
    System.out.println(f2.getPath());
    System.out.println(f2.length());
    System.out.println(f2.isFile());
    System.out.println(f2.isDirectory());
  }
}