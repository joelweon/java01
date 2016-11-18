package step18;

import java.io.File;
import java.io.FileOutputStream;

public class Exam095_1 {
  public static void main(String[] args) throws Exception {
    File file = new File("temp/Exam095_1.data");
    
    //지정된 파일이 없으면 만들고 있으면 덮어쓴다.
    FileOutputStream out = new FileOutputStream(file);

    out.write(10);  //1바이트 출력
    out.write(20);
    out.write(30);

    out.close();
  }
}