/* 주제: File 클래스 사용법 - FilenameFilter와 Lambda 문법
*/
package step18;

import java.io.File;
import java.io.FilenameFilter;

public class Exam094_8 {
  public static void main(String[] args) throws Exception {
    if (args.length == 0) {
      System.out.println("사용법: java step18.Exam094_8 디렉토리명");
      return;
    }

    File f1 = new File(args[0]);
    if (!f1.isDirectory()) {
      System.out.println("디렉토리가 아닙니다.");
      return;
    }

    String[] filenames = f1.list((dir, name) -> {
      if (name.endsWith(".java"))
        return true;
      return false;
    });

    for (String filename : filenames) {
      System.out.printf("%s\n", filename);
    }
  }
}