package step20.ex3.v4;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {

  public static void main(String[] args) throws Exception {
    ServerSocket serverSocket = new ServerSocket(8888);
    System.out.println("서버 실행 중...");
    while (true) {
      Socket socket = serverSocket.accept();
      DataInputStream socketIn = new DataInputStream(socket.getInputStream());
      PrintStream socketOut = new PrintStream(socket.getOutputStream()); //한줄 출력하기에 좋음.
      
      System.out.printf("파일명: %s\n",socketIn.readUTF());
      System.out.printf("파일 크기: %d\n",socketIn.readLong());
      socketOut.println("ok");

      socketOut.close();
      socketIn.close();
      socket.close();
    }

  }

}
