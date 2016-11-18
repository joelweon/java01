package as;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
  public static void main(String[] args) throws Exception {
    //클라이언트 요청을 기다리는 랜카드 접속 객체 준비
    ServerSocket ss = new ServerSocket(8888);
    System.out.println("에코서버시작");
    
    while (true) {
      try {
//        대기열에서 기다리고 있는 클라이언트들 중에서 한개의 클라이언트 접속을 승인한다.
        Socket socket = ss.accept();
        System.out.println("클라이언트와 연결되었습니다.");
        
        Scanner in = new Scanner(socket.getInputStream());
        PrintStream out = new PrintStream(socket.getOutputStream());
        
        String message = null;
        
        do {
          message = in.nextLine();
          out.println("엄진영: " + message);
        } while (!message.toLowerCase().equals("quit"));
        
        out.close();
        in.close();
        socket.close();
      } catch (Exception e) {}
    }
    
  }
}