package step18;

import java.io.File;

public class Exam094_5 {
  public static void main(String[] args) throws Exception{
    if (args.length == 0) {
      System.out.println("사용법: java step18.Exam094_5 디렉토리명");
      return;
    }

    File f1 = new File(args[0]);
    if (!f1.isDirectory()) {
      System.out.println("디렉토리가 아닙니다.");
      return;
    }
    
    File[] files = f1.listFiles();
    for (File file : files) {
      System.out.printf("%s %-6d %s \n",
        (file.isDirectory() ? "d" : "-"), file.length(), file.getName());

      // if (file.isDirectory()) {
      //   System.out.println("d  " + filename);
      // } else{
      //   System.out.println("-  " + filename);
      // }
    }
  }
}
