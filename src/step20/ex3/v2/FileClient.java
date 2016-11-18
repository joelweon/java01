package step20.ex3.v2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class FileClient {

  public static void main(String[] args) throws Exception {
    File file = new File("temp/jls8.pdf");
    BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
//    FileInputStream fi = new FileInputStream(file);
//    BufferedInputStream in = new BufferedInputStream(fi);
    
    System.out.printf("파일명: %s\n",file.getName());
    System.out.printf("파일크기: %d\n",file.length());
    
    while (true) {
      int b = in.read();
      if (b == -1)
        break;
    }
    System.out.println("파일을 모두 읽었습니다.");
    in.close();
  }

}
