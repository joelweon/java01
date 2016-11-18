package test1;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.Socket;
import java.util.Scanner;

public class FileClient {
  public static void main(String[] args) {
    try {
      Scanner keyScan = new Scanner(System.in);
    
      System.out.println("서버 주소? ");
      String serverAddr = keyScan.nextLine();
      
      System.out.println("파일 경로? ");
      String fileName = keyScan.nextLine();
      
      Socket socket = new Socket(serverAddr, 8888);
      
      File file = new File(fileName);
      FileInputStream in = new FileInputStream(file);
      long fileSize = file.length();
      
      DataOutputStream out = new DataOutputStream(socket.getOutputStream());
      
      byte[] bytes = new byte[8192];
      int len = 0;
      
      out.writeLong(fileSize);
      out.writeUTF(fileName);
      
      while ((len = in.read(bytes)) > 0) {
        out.write(bytes, 0, len);
      }
      
      System.out.println("서버에 전송을 완료했습니다.");
      
      out.close();
      in.close();
      socket.close();
      keyScan.close();
    } catch (FileNotFoundException e) {
    System.out.println("입력하신 파일을 찾지 못했습니다.");
    } catch (Exception e) {}
    
  }
}