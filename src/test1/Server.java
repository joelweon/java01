package test1;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
  public static void main(String[] args) throws Exception {
    
    ServerSocket ss = new ServerSocket(8888);
    System.out.println("파일 서버 시작!");
    long fileSize = 0;
    String fileName = null;
    
    while (true) {
      try {
        Socket socket = ss.accept();
        System.out.println("클라이언트와 연결되었습니다. -----------------------");
        
        DataInputStream in = new DataInputStream(socket.getInputStream());
        
        fileSize = in.readLong();
        fileName = in.readUTF();
        System.out.println("파일다운로드 시작... " + fileName);
        
        FileOutputStream out = new FileOutputStream(fileName);
        
        byte[] bytes = new byte[8192];
        int len = 0;
        while ((len = in.read(bytes)) > 0) {
          out.write(bytes, 0, len);
        }
        System.out.println("다운로드 완료");
        
        out.close();
        in.close();
        socket.close();
      } catch (Exception e) {
      }
      
    }
  }
 
}