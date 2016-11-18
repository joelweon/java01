package as;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MiniWebServer {
  public static void main(String[] args) throws Exception {
    ServerSocket serverSocket = new ServerSocket(8888);
    System.out.println("웹 서버 시작!");
    
    while (true) {
      try {
        Socket socket = serverSocket.accept();
        System.out.println("클라이언트와 연결 성공!");
        
//        InputStream in = socket.getInputStream();
//        OutputStream out = socket.getOutputStream();
//        Scanner in2 = new Scanner(in);
//        PrintStream out2 = new PrintStream(out);
        
        Scanner in2 = new Scanner(socket.getInputStream());
        PrintStream out2 = new PrintStream(socket.getOutputStream());
        
        String line = null;
        do {
          line = in2.nextLine();
          System.out.println(line);
        } while (line.length() != 0);
        
        out2.println("HTTP/1.1 200 OK");
        out2.println("Server: Java89 Mini Web Server");
        out2.println("Content-Length: 23");
        out2.println("Context-Type: text/plain;charset=UTF-8");
        out2.println();
        out2.print("Hello, world!-엄진영");
        
        out2.close();
        in2.close();
        socket.close();
      } catch (Exception e) {
        
      }
    }
  }
}