package step20.ex3.v6;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {

  public static void main(String[] args) throws Exception {
    ServerSocket serverSocket = new ServerSocket(8888);
    System.out.println("서버 실행 중...");
    
    while (true) {

      Socket socket = serverSocket.accept();
      printClientInfo(socket);
      DataInputStream socketIn = new DataInputStream(socket.getInputStream());
      PrintStream socketOut = new PrintStream(socket.getOutputStream()); //한줄 출력하기에 좋음.
      
      String fileName = socketIn.readUTF();
      long fileSize = socketIn.readLong();
      System.out.printf("전송받은 파일명: %s\n",fileName);
      System.out.printf("전송받은 파일 크기: %d\n",fileSize);
      FileOutputStream out = new FileOutputStream("upload/" + fileName);
      
      for (long i = 0; i < fileSize; i++) {
        out.write(socketIn.read());
      }
  
      socketOut.println("ok");
  
      out.close();
      socketOut.close();
      socketIn.close();
      socket.close();
    }
  }

  private static void printClientInfo(Socket socket) {
    InetSocketAddress socketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
    System.out.printf("클라이언트 IP: %s", socketAddress.getAddress());
  }

}