package as;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;
import java.util.Scanner;

public class FileClient {
  public static void main(String[] args) throws Exception {
    Socket socket = new Socket("localhost", 8888);
    Scanner keyScan = new Scanner(System.in);
    System.out.println("파일명을 입력: ");
    File file = new File(keyScan.nextLine());
    
    System.out.println("파일명: " + file.getName());
    System.out.println("파일크기: " + file.length());
    
    BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
    
    while (true) {
      int i = in.read();
      if (i == -1)
        break;
    }
    System.out.println("다 읽음");
    in.close();
    keyScan.close();
  }
}