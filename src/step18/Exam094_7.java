package step18;

import java.io.File;
import java.io.FilenameFilter;

public class Exam094_7 {
  public static void main(String[] args) throws Exception{
    if (args.length == 0) {
      System.out.println("사용법: java step18.Exam094_7 디렉토리명");
      return;
    }

    File f1 = new File(args[0]);
    if (!f1.isDirectory()) {
      System.out.println("디렉토리가 아닙니다.");
      return;
    }
    
    String[] filenames = f1.list(new TextFileFilter());

    for (String filename : filenames) {
      System.out.printf("%s\n", filename);
    }
  }

  static class JavaFileFilter implements FilenameFilter {
    public boolean accept(File dir, String name) {
      if (name.endsWith(".java"))
        return true;
      return false;
    }
  }
  static class TextFileFilter implements FilenameFilter {
    public boolean accept(File dir, String name) {
      if (name.endsWith(".txt"))
        return true;
      return false;
    }
  }
}
