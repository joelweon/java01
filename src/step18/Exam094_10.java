package step18;

import java.io.File;
import java.io.FileFilter;

public class Exam094_10 {
  public static void main(String[] args) throws Exception {
    if (args.length == 0) {
      System.out.println("사용법: java step18.Exam094_10 디렉토리명");
      return;
    }

    File f1 = new File(args[0]);
    if (!f1.isDirectory()) {
      System.out.println("디렉토리가 아닙니다.");
      return;
    }

    printFileInfo(f1);
  }
  // static void printFileInfo(File dir) {
  //   File[] files = dir.listFiles();
  //   for (int i = 0; i < files.length; i++) {
  //     if (files[i].isFile()) {
  //       System.out.println(files[i].getPath());
  //     } else {
  //       printFileInfo(files[i]);
  //     }
  //   }
  // }

  static void printFileInfo(File dir) {
    File[] files = dir.listFiles();
    for (File file : files) {
      if (file.isFile()) {
        System.out.println(file.getPath());
      } else {
        printFileInfo(file);
      }
    }
  }
}
