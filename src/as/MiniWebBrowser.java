package as;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class MiniWebBrowser {
  public static void main(String[] args) throws UnknownHostException, IOException {
    Socket socket = new Socket("blog.eomjinyoung.com", 80);
    
    
    Scanner in2 = new Scanner(socket.getInputStream());
    PrintStream out2 = new PrintStream(socket.getOutputStream());
    
    out2.println("GET / HTTP/1.1");
    out2.println("Host: www.naver.com");
    out2.println();
    
    String line = null;
    while (true) {
      try {
        line = in2.nextLine();
        System.out.println(line);
      } catch (Exception e) {
        break;
      }
    }
    
    out2.close();
    in2.close();
    socket.close();
  }
}