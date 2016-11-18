package step18;

import java.io.File;

public class Exam094_6 {
  public static void main(String[] args) throws Exception{
    if (args.length == 0) {
      System.out.println("사용법: java step18.Exam094_6 디렉토리명");
      return;
    }

    File f1 = new File(args[0]);
    if (!f1.isDirectory()) {
      System.out.println("디렉토리가 아닙니다.");
      return;
    }
    
    String[] filenames = f1.list();
    for (String filename : filenames) {
      if (filename.endsWith(".java")) { 
      System.out.printf("%s\n", filename);
      }

    }
  }
}
